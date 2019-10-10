package com.spring.hero.filter;

import com.spring.hero.handler.AppContext;
import com.spring.hero.pojo.User;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Dynamic proxy shared resource
 *
 * @author daiqun
 * @version 2019.08.27
 */
public class AppContextFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        // Get dynamic proxy instance
        AppContext appContext = AppContext.getContext();
        User user = (User) session.getAttribute("USER");
        appContext.addObject("APP_CONTEXT_USER", user);
        appContext.addObject("APP_CONTEXT_REQUEST", request);
        appContext.addObject("APP_CONTEXT_RESPONSE", response);
        appContext.addObject("APP_CONTEXT_SESSION", session);

        // Project name
        AppContext.setContextPath(request.getContextPath());

        try {
            chain.doFilter(request, response);
        } finally {
            appContext.clear();
        }
    }

    @Override
    public void destroy() {
    }
}

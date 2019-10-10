package com.spring.hero.filter;

import com.spring.hero.constant.Constants;
import com.spring.hero.pojo.User;
import com.spring.hero.utils.PathUtil;
import org.springframework.util.StringUtils;

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
 * @author daiqun
 * @version 2019.08.27
 */
public class SessionFilter implements Filter {

    protected FilterConfig config;
    private String passPages = "";

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;

        if (config.getInitParameter("PASS_PAGE") != null) {
            this.passPages = config.getInitParameter("PASS_PAGE");
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
0        HttpServletRequest servletRequest = (HttpServletRequest) request;
        HttpServletResponse servletResponse = (HttpServletResponse) response;
        String URL = servletRequest.getRequestURI();
        String requestedURL = URL.substring(servletRequest.getContextPath().length() + 1);
        String[] pages = passPages.split(",");
        boolean isAllow = false;

        for (String page : pages) {
            if (page.equals(requestedURL)) {
                isAllow = true;
                break;
            }
        }

        if (isAllow) {
            chain.doFilter(servletRequest, servletResponse);
        } else {
            HttpSession session = servletRequest.getSession();
            User user = (User) session.getAttribute("USER");

            if (user == null) {
                if (servletRequest.getMethod().toLowerCase().equals("get")) {
                    String queryString = servletRequest.getQueryString();
                    String go = requestedURL;

                    if (!StringUtils.isEmpty(queryString)) {
                        go = go + "#" + servletRequest.getQueryString();
                    }

                    servletResponse.sendRedirect(PathUtil.pagePath("login/account?go=") + go);
                } else {
                    servletResponse.sendRedirect(PathUtil.pagePath("login/account"));
                }
            } else {
                chain.doFilter(servletRequest, servletResponse);
            }
        }
    }

    @Override
    public void destroy() {
    }
}

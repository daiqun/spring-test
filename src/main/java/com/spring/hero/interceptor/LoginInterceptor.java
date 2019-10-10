package com.spring.hero.interceptor;

import com.spring.hero.handler.AppContext;
import com.spring.hero.pojo.User;
import com.spring.hero.utils.PathUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author daiqun
 * @version 2019.08.28
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("在控制器执行前调用 ");
        User user = AppContext.getContext().getUser();
        if (user == null) {
            System.out.println("当前用户未登录!");
            response.sendRedirect(PathUtil.pagePath("login/account"));
            return false;
        }
        System.out.println("当前用户已登录，登录的用户名为： " + user.getUsername());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //controller方法处理完毕后，调用此方法
        System.out.println("在后端控制器执行后调用 ");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //页面渲染完毕后调用此方法
        System.out.println("整个请求执行完成后调用 ");
    }
}

package com.spring.hero.config;

import com.spring.hero.filter.AppContextFilter;
import com.spring.hero.filter.SessionFilter;
import com.spring.hero.interceptor.LoginInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daiqun
 * @version 2019.08.27
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean sessionFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SessionFilter());
        registration.addUrlPatterns("/*");
        Map<String, String> params = new HashMap<>();
        params.put("PASS_PAGE", ",login/account");
        registration.setInitParameters(params);
        registration.setOrder(1);
        System.out.println("session filter----------" + registration.getFilter().getClass().getName());
        return registration;
    }

    @Bean
    public FilterRegistrationBean appContextFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new AppContextFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(2);
        System.out.println("app context filter----------" + registration.getFilter().getClass().getName());
        return registration;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
        /*同一异常和无界面*/
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns("/error");
        interceptorRegistration.excludePathPatterns("/login");
        interceptorRegistration.excludePathPatterns("/login/account");
//        interceptorRegistration.excludePathPatterns("/**");
//        interceptorRegistration.excludePathPatterns("/index");
    }
}

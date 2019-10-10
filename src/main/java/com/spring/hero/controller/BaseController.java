package com.spring.hero.controller;

import com.spring.hero.constant.Constants;
import com.spring.hero.handler.AppContext;
import com.spring.hero.pojo.User;
import com.spring.hero.pojo.dto.Result;
import com.spring.hero.utils.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * @author daiqun
 * @version 2019.04.29
 */
public class BaseController {

    private final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * Catch exception from dao --> controller --> spring container
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception ex) {
        logger.error(ex.getMessage());
        Result result = new Result("error", ex.getMessage());
        return result;
    }

    /**
     * Get user
     *
     * @return
     */
    protected User getUser() {
        return AppContext.getContext().getUser();
    }

    /**
     * Get login userName
     *
     * @return
     */
    public String getUserName() {
        User user = getUser();

        if (user != null) {
            return user.getUsername();
        }

        return "";
    }

    /**
     * Get login userId
     *
     * @return
     */
    public Long getUserId() {
        User user = getUser();

        if (user != null) {
            return user.getId();
        }

        return 0L;
    }

    protected void setSession(String key, Object object) {
        SessionUtil.setSession(key, object);
    }

    protected void getSession(String key) {
        SessionUtil.getSession(key);
    }

    protected void removeSession(String key) {
        SessionUtil.removeSession(key);
    }

    protected void invalidate() {
        SessionUtil.invalidate();
    }
}

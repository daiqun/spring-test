package com.spring.hero.utils;

import com.spring.hero.constant.Constants;
import com.spring.hero.controller.UserController;
import com.spring.hero.handler.AppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class SessionUtil {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * Get session in thread local
     *
     * @return
     */
    private static Object getSessionInThread() {
        Object session = AppContext.getContext().getObject(Constants.APP_CONTEXT_SESSION);

        return session;
    }

    /**
     * Invoke setAttribute method
     *
     * @param key
     * @param object
     */
    public static void setSession(String key, Object object) {
        Object session = getSessionInThread();

        if (session == null) {
            return;
        }

        try {
            Class<?>[] param = new Class[Constants.SESSION_PARAM_NUMBER];
            param[Constants.INT_INITIAL_VALUE] = String.class;
            param[Constants.INT_NUMBER_ONE] = Object.class;
            Method method = session.getClass().getMethod(Constants.SESSION_METHOD_SETATTRIBUTE, param);
            Object[] objects = new Object[Constants.SESSION_PARAM_NUMBER];
            objects[Constants.INT_INITIAL_VALUE] = key;
            objects[Constants.INT_NUMBER_ONE] = object;
            method.invoke(session, objects);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    /**
     * Invoke getAttribute method
     *
     * @param key
     * @return
     */
    public static Object getSession(String key) {
        Object session = getSessionInThread();

        if (session == null) {
            return null;
        }

        try {
            Class<?>[] param = new Class[Constants.SESSION_PARAM_NUMBER_ONE];
            param[Constants.INT_INITIAL_VALUE] = String.class;
            Method method = session.getClass().getMethod(Constants.SESSION_METHOD_GETATTRIBUTE, param);
            Object[] objects = new Object[Constants.SESSION_PARAM_NUMBER_ONE];
            objects[Constants.INT_INITIAL_VALUE] = key;
            Object returnValue = method.invoke(session, objects);

            return returnValue;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }

        return null;
    }

    /**
     * Invoke removeAttribute method
     *
     * @param key
     */
    public static void removeSession(String key) {
        Object session = getSessionInThread();

        if (session == null) {
            return;
        }

        try {
            Class<?>[] param = new Class[Constants.SESSION_PARAM_NUMBER_ONE];
            param[Constants.INT_INITIAL_VALUE] = String.class;
            Method method = session.getClass().getMethod(Constants.SESSION_METHOD_REMOVE_ATTRIBUTE, param);
            Object[] objects = new Object[Constants.SESSION_PARAM_NUMBER_ONE];
            objects[Constants.INT_INITIAL_VALUE] = key;
            method.invoke(session, objects);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }

    /**
     * Invoke invalidate method
     */
    public static void invalidate() {
        Object session = getSessionInThread();

        if (session == null) {
            return;
        }

        try {
            Method method = session.getClass().getMethod(Constants.SESSION_METHOD_INVALIDATE);
            method.invoke(session);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}

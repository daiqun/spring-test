package com.spring.hero.utils;

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
        Object session = AppContext.getContext().getObject("APP_CONTEXT_SESSION");

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
            Class<?>[] param = new Class[2];
            param[0] = String.class;
            param[1] = Object.class;
            Method method = session.getClass().getMethod("setAttribute", param);
            Object[] objects = new Object[2];
            objects[0] = key;
            objects[1] = object;
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
            Class<?>[] param = new Class[1];
            param[0] = String.class;
            Method method = session.getClass().getMethod("getAttribute", param);
            Object[] objects = new Object[1];
            objects[0] = key;
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
            Class<?>[] param = new Class[1];
            param[0] = String.class;
            Method method = session.getClass().getMethod("removeAttribute", param);
            Object[] objects = new Object[1];
            objects[0] = key;
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
            Method method = session.getClass().getMethod("invalidate");
            method.invoke(session);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}

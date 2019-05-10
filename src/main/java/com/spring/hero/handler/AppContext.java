package com.spring.hero.handler;

import com.spring.hero.constant.Constants;
import com.spring.hero.pojo.User;

import java.util.HashMap;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class AppContext {

    /*
     * private static Map<Thread, AppContext> appContextMap = new HashMap<Thread, AppContext>();
     */
    private static final ThreadLocal<AppContext> appContext = new ThreadLocal<AppContext>();
    private final HashMap<String, Object> values = new HashMap<String, Object>();
    private static String contextPath;

    public static String getContextPath() {
        return contextPath;
    }

    public static void setContextPath(String contextPath) {

        if (AppContext.contextPath == null) {
            AppContext.contextPath = contextPath;
        }
    }

    /**
     * Gets the context in which the current thread is shared
     *
     * @return AppContext
     */
    public static AppContext getContext() {
        AppContext context = appContext.get();

        if (context == null) {
            context = new AppContext();
            appContext.set(context);
        }

        return context;
    }

    /**
     * When the end of the thread to clear the thread corresponding to the
     * context
     */
    public void clear() {
        AppContext context = appContext.get();

        if (context != null) {
            context.values.clear();
        }

        context = null;
    }

    /**
     * Gets the instance shared by the current thread
     *
     * @return
     */
    public HashMap<String, Object> getValues() {
        return values;
    }

    /**
     * Add an instance to the current thread
     *
     * @param key
     * @param value
     */
    public void addObject(String key, Object value) {
        values.put(key, value);
    }

    /**
     * Gets the instance saved in the thread based on the key value
     *
     * @param key
     * @return
     */
    public Object getObject(String key) {
        return values.get(key);
    }

    /**
     * Clears the instance to be cleaned in the current thread
     */
    public void removeObject(String key) {
        values.remove(key);
    }

    public User getUser() {
        return (User) values.get(Constants.APP_CONTEXT_USER);
    }

    public String getUserName() {
        User user = (User) values.get(Constants.APP_CONTEXT_USER);

        if (user != null) {
            return user.getUsername();
        }

        return Constants.STING_EMPTY;
    }

    public Long getUserId() {
        User user = (User) values.get(Constants.APP_CONTEXT_USER);

        if (user != null) {
            return user.getId();
        }

        return 0L;
    }
}

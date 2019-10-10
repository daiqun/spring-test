package com.spring.hero.utils;

import com.spring.hero.handler.AppContext;
import org.springframework.util.StringUtils;

/**
 * @author daiqun
 * @version 2019.08.27
 */
public class PathUtil {

    /**
     * Back-end path
     *
     * @param path
     * @return
     */
    public static String pagePath(String path) {

        if (path == null) {
            path = "";
        }

        String urlPrefix = "";

        if (!StringUtils.isEmpty(urlPrefix)) {
            urlPrefix += "/";
        }

        return "http://localhost:8000" + "/" + urlPrefix + path;
    }
}

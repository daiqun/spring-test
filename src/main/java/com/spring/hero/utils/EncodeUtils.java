package com.spring.hero.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class EncodeUtils {

    private static final Logger logger = LoggerFactory.getLogger(EncodeUtils.class);

    public static String encodePassword(String str) {
        StringBuffer md5StrBuff = new StringBuffer();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));

            byte[] byteArray = messageDigest.digest();

            for (int i = 0; i < byteArray.length; i++) {
                if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                    md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
                else {
                    md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return md5StrBuff.toString().toUpperCase();
    }
}

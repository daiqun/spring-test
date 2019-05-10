package com.spring.hero.exception;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class BusinessException extends FrameworkBaseException {

    public BusinessException(String message, Object... params) {
        super(message, params);
    }

    public BusinessException(String message, Throwable cause, Object... params) {
        super(message, cause, params);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}

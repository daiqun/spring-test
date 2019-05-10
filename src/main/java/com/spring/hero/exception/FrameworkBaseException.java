package com.spring.hero.exception;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public abstract class FrameworkBaseException extends RuntimeException {

    protected Object[] params;

    protected FrameworkBaseException() {
        super();
    }

    public FrameworkBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public FrameworkBaseException(String message) {
        super(message);
    }

    public FrameworkBaseException(Throwable cause) {
        super(cause);
    }

    public FrameworkBaseException(String message, Object... params) {
        super(message);
        this.params = params;
    }

    public FrameworkBaseException(String message, Throwable cause, Object... params) {
        super(message, cause);
        this.params = params;
    }

    public Object[] getParams() {
        return this.params;
    }
}

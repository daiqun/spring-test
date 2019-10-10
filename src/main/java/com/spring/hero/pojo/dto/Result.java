package com.spring.hero.pojo.dto;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class Result {

    private String status;
    private String message;

    public Result() {
    }

    public Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public static Result getInstance(String status, String message) {
        return new Result(status, message);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.spring.hero.advice;

import com.spring.hero.exception.BusinessException;
import com.spring.hero.pojo.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author daiqun
 * @version 2019.08.26
 */
@ControllerAdvice
public class RestExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    /**
     * 统一异常处理
     *
     * @param e Controller中抛出的异常
     * @return 异常处理后需要返回给前台的对象
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        logger.error("RESTful Integration调用异常: {}", e.getMessage());

        // 具体的异常处理逻辑
        if (e instanceof BusinessException) {

        }

        return new Result("error", e.getMessage());
    }
}

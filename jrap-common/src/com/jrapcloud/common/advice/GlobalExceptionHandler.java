package com.jrapcloud.common.advice;

import com.jrapcloud.common.base.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author IvanStephen
 * @project jrapcloud
 * @date 2020/3/18 8:06
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception{
        logger.error("", e);
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            responseData.setCode(404);
        }else{
            responseData.setCode(500);
        }

        responseData.setData(null);
        responseData.setStatus(false);
        return responseData;
    }
}

package jha.spring.springquicklystart.utils;

import jha.spring.springquicklystart.pojo.Request;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(Exception.class)
public Request ex(Exception e) {
    e.printStackTrace();
    return Request.err(e.getMessage());
}
}

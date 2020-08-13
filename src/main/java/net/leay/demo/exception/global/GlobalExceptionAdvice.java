package net.leay.demo.exception.global;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/13/20 3:07 PM
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
  @ExceptionHandler(value = TestException.class)
  @ResponseBody
  public String testException() {
    return "TestException";
  }
}

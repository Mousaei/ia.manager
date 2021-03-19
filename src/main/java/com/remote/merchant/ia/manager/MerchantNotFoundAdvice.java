package com.remote.merchant.ia.manager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class MerchantNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(MerchantNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(MerchantBeanNotFoundException ex) {
    return ex.getMessage();
  }
}

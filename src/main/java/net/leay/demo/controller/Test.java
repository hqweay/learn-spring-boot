package net.leay.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 5/29/20 12:26 AM
 */
@RestController
@RequestMapping("/ee")
public class Test {

  @GetMapping("/login")
  @ResponseStatus(HttpStatus.OK)
  public String test() {
    return "test";
  }
}

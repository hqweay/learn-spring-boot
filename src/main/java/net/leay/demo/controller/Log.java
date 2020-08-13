package net.leay.demo.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/13/20 3:24 PM
 */
@Slf4j
@RestController
@RequestMapping("/log")
public class Log {
  @ApiOperation(value = "test log")
  @GetMapping("/test")
  public String testLog() {
    log.info("log4j2 test date: {}  info: {}", LocalDate.now(), "oh you can really dance");
    return "test log";
  }
}

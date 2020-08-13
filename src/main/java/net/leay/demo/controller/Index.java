package net.leay.demo.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author hqweay
 * @description: TODO
 * Created on 5/28/20 11:36 PM
 */

@RestController
@RequestMapping("/")
public class Index {

  @ApiOperation(value = "dd")
  @GetMapping("/login")
  @ResponseStatus(HttpStatus.OK)
  public String test(@RequestParam("name") String name) {
    System.out.println(name);
    return "test";
  }

  @ApiOperation(value = "dd")
  @GetMapping("/test")
  public String tesst() {
    System.out.println("namehahahhaha");
    return "test";
  }
}

package net.leay.demo.controller;


import io.swagger.annotations.ApiOperation;
import net.leay.demo.entity.Resume;
import net.leay.demo.service.impl.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hqweay
 * @since 2020-08-13
 */
@RestController
@RequestMapping("/demo/resume")
public class ResumeController {

  @Autowired
  private ResumeServiceImpl resumeService;

  @ApiOperation(value = "dd")
  @GetMapping("/test")
  @ResponseStatus(HttpStatus.OK)
  public ArrayList<Resume> test() {
    ArrayList<Resume> resumes = (ArrayList<Resume>) resumeService.list();
    System.out.println(resumes);

    return resumes;
    // return "test";
  }
}

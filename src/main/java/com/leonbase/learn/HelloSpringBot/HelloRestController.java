package com.leonbase.learn.HelloSpringBot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello. Message from spring bot via RestController.";
  }
}
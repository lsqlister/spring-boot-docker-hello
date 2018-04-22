package com.github.spring.boot.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World. <br />" + "Welcome to <a href='http://www.lsqlister.com'>lsqlister.com</a></li>";
  }

  @RequestMapping("/hello")
  public String hello() {
    return "hello docker hub git hub";
  }

}

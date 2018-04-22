package com.github.spring.boot.docker.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World. <br />" + "Welcome to <a href='http://waylau.com'>waylau.com</a></li>";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloController.class, args);
  }

}

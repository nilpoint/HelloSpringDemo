package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by john on 16-7-24.
 */
@Controller
public class HomeController {
  @RequestMapping("/")
  public String home(){
    return "home";
  }
}

package com.greenfox.balintvecsey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 06. 02..
 */
@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping
  public String index() {
    return "index";
  }
}

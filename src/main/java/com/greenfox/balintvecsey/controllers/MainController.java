package com.greenfox.balintvecsey.controllers;

import com.greenfox.balintvecsey.services.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bálint on 2017. 06. 02..
 */
@Controller
@RequestMapping("/")
public class MainController {

  @Autowired
  private MealRepository mealRepository;

  @RequestMapping
  public String index(Model model) {
    model.addAttribute("meals", mealRepository.findAll());
    return "index";
  }
}

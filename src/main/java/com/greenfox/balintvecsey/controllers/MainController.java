package com.greenfox.balintvecsey.controllers;

import com.greenfox.balintvecsey.models.TypeOfMeal;
import com.greenfox.balintvecsey.services.MealRepository;
import com.greenfox.balintvecsey.services.MealService;
import com.greenfox.balintvecsey.services.TypeOfMealRepository;
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

  @Autowired
  private TypeOfMealRepository typeOfMealRepository;

  @Autowired
  private MealService mealService;

  @RequestMapping
  public String index(Model model) {
    model.addAttribute("meals", mealRepository.findAll());
    model.addAttribute("sumMeals", mealRepository.count());
    model.addAttribute("sumCalories", mealService.sumCalories());
    return "index";
  }

  @RequestMapping("/addoredit")
  public String addoredit(Model model) {
    model.addAttribute("typeOfMeals", typeOfMealRepository.findAll());
    return "addoredit";
  }

  @RequestMapping("/addoredit/hit")
  public String submit() {
    return "redirect:/";
  }
}

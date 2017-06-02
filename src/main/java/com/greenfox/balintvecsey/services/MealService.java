package com.greenfox.balintvecsey.services;

import com.greenfox.balintvecsey.models.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 06. 02..
 */
@Component
public class MealService {

  @Autowired
  MealRepository mealRepository;

  public double sumCalories() {
    double sum = 0d;
    for (Meal meal: mealRepository.findAll()) {
      sum += meal.getCalories();
    }

    return sum;
  }

}

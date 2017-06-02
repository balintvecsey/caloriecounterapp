package com.greenfox.balintvecsey.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 06. 02..
 */
@Entity
@Getter
@Setter
public class TypeOfMeal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String name;
}

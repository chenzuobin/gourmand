package com.gourmand.foodservice.api.food.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "FoodController")
@RequestMapping(value = "/food")
public class FoodController {

    @GetMapping(value = "/test")
    public String test(@RequestParam(value = "name") String name){
        return "hello name=" + name;
    }
}

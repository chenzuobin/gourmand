package com.gourmand.consumerservice.api.consumer.controller;

import com.gourmand.consumerservice.api.feign.food.FoodFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController(value = "ConsumerController")
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Autowired
    private FoodFeign foodFeign;

    @Value("${spring.profiles.active:没有名字}")
    private String profiles;

    @GetMapping(value = "/test")
    public String test(@RequestParam("name") String name){
        return foodFeign.test(name) + "config:" + this.profiles;
    }
}

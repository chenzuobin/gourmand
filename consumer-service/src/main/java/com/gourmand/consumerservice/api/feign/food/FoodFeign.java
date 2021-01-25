package com.gourmand.consumerservice.api.feign.food;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "food-service")
@RequestMapping(value = "/food")
public interface FoodFeign {

    @GetMapping(value = "/food/test")
    String test(@RequestParam("name") String name);
}

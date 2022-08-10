package com.example.progmaticwaiter.controllers;

import com.example.progmaticwaiter.models.Food;
import com.example.progmaticwaiter.services.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/foods")
    public String getFoods(Model model) {
        List<Food> foods = foodService.getAll();
        model.addAttribute("foods", foods);

        return "foods";
    }
}

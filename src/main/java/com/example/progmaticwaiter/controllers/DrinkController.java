package com.example.progmaticwaiter.controllers;

import com.example.progmaticwaiter.models.Drink;
import com.example.progmaticwaiter.services.DrinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DrinkController {

    private DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/drinks")
    public String getDrinks(Model model) {
        List<Drink> drinks = drinkService.getAll();
        model.addAttribute("drinks", drinks);

        return "drinks";
    }
}

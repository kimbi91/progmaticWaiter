package com.example.progmaticwaiter.controllers;


import com.example.progmaticwaiter.models.SumOrder;
import com.example.progmaticwaiter.services.DrinkService;
import com.example.progmaticwaiter.services.FoodService;
import com.example.progmaticwaiter.services.SumOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SumOrderController {

    private SumOrderService sumOrderService;

    private FoodService foodService;

    private DrinkService drinkService;


    public SumOrderController(SumOrderService sumOrderService, FoodService foodService, DrinkService drinkService) {
        this.sumOrderService = sumOrderService;
        this.foodService = foodService;
        this.drinkService = drinkService;
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<SumOrder> sumOrders = sumOrderService.getAll();
        model.addAttribute("orders", sumOrders);
        model.addAttribute("foodservice", foodService);
        model.addAttribute("drinkservice", drinkService);

        return "orders";
    }

    @GetMapping("/orders/new")
    public String newOrderItems(Model model) {

        return "new";
    }


}

package com.example.progmaticwaiter.controllers;


import com.example.progmaticwaiter.models.SumOrder;
import com.example.progmaticwaiter.services.SumOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SumOrderController {

    private SumOrderService sumOrderService;


    public SumOrderController(SumOrderService sumOrderService) {
        this.sumOrderService = sumOrderService;
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<SumOrder> sumOrders = sumOrderService.getAll();
        model.addAttribute("orders", sumOrders);

        return "orders";
    }

    @GetMapping("/orders/new")
    public String newOrderItems(Model model) {

        return "new";
    }


}

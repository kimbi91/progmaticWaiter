package com.example.progmaticwaiter.controller;

import com.example.progmaticwaiter.model.SumOrder;
import com.example.progmaticwaiter.service.SumOrderService;
import com.example.progmaticwaiter.service.TestDataLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SumOrderController {

    private SumOrderService sumOrderService;


    public SumOrderController(SumOrderService sumOrderService, TestDataLoader testDataLoader) {
        this.sumOrderService = sumOrderService;
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<SumOrder> sumOrders = sumOrderService.getAll();
        model.addAttribute("orders", sumOrders);

        return "orders";
    }

    @GetMapping("/orders/neworder")
    public String newOrder(Model model) {
        model.addAttribute("order", new SumOrder());

        return "newOrder";
    }

    @PostMapping("/orders/neworder")
    public String saveOrder(SumOrder sumOrder) {
        sumOrderService.saveOrder(sumOrder);

        return "redirect:/orders";
    }

}

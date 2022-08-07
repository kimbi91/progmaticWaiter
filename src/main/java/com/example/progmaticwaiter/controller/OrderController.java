package com.example.progmaticwaiter.controller;

import com.example.progmaticwaiter.model.Order;
import com.example.progmaticwaiter.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);

        return "orders";
    }

    @GetMapping("/orders/neworder")
    public String newOrder(Model model) {
        model.addAttribute("order", new Order());

        return "newOrder";
    }

    @PostMapping("/orders/neworder")
    public String saveOrder(Order order) {
        orderService.saveOrder(order);

        return "redirect:/orders";
    }
}

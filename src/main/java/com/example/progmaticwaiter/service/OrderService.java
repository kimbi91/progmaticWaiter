package com.example.progmaticwaiter.service;

import com.example.progmaticwaiter.model.Drink;
import com.example.progmaticwaiter.model.Food;
import com.example.progmaticwaiter.model.Order;
import com.example.progmaticwaiter.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return new ArrayList<>((Collection) orderRepository.findAll());
    }

    public Order saveOrder(Order order) {
        orderRepository.save(order);

        return order;
    }
}

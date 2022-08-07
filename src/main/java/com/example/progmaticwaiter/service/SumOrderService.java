package com.example.progmaticwaiter.service;

import com.example.progmaticwaiter.model.SumOrder;
import com.example.progmaticwaiter.repository.SumOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class SumOrderService {

    private SumOrderRepository sumOrderRepository;

    public SumOrderService(SumOrderRepository sumOrderRepository) {
        this.sumOrderRepository = sumOrderRepository;
    }

    public List<SumOrder> getAll() {
        return new ArrayList<>((Collection) sumOrderRepository.findAll());
    }

    public SumOrder saveOrder(SumOrder sumOrder) {
        sumOrderRepository.save(sumOrder);

        return sumOrder;
    }
}

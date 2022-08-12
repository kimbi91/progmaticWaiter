package com.example.progmaticwaiter.services;

import com.example.progmaticwaiter.models.SumOrder;
import com.example.progmaticwaiter.repositories.SumOrderRepository;
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

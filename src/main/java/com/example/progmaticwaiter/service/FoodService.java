package com.example.progmaticwaiter.service;

import com.example.progmaticwaiter.model.Food;
import com.example.progmaticwaiter.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class FoodService {

    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<FoodService> getAll() {
        return new ArrayList<>((Collection) foodRepository.findAll());
    }

    public Food saveFood(Food food) {
        foodRepository.save(food);

        return food;
    }
}

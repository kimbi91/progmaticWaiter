package com.example.progmaticwaiter.services;

import com.example.progmaticwaiter.models.Food;
import com.example.progmaticwaiter.models.SumOrder;
import com.example.progmaticwaiter.repositories.FoodRepository;
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

    public List<Food> getAll() {
        return new ArrayList<>((Collection) foodRepository.findAll());
    }

    public Food saveFood(Food food) {
        foodRepository.save(food);

        return food;
    }

    public List<Food> getFoodsByOrderId(Long id) {
        return foodRepository.getFoodsByOrderId(id);
    }
}

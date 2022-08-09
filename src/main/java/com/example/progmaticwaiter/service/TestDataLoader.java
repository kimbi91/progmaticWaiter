package com.example.progmaticwaiter.service;

import com.example.progmaticwaiter.model.Drink;
import com.example.progmaticwaiter.model.Food;
import com.example.progmaticwaiter.model.SumOrder;
import com.example.progmaticwaiter.repository.DrinkRepository;
import com.example.progmaticwaiter.repository.FoodRepository;
import com.example.progmaticwaiter.repository.SumOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestDataLoader {

    private DrinkRepository drinkRepository;

    private FoodRepository foodRepository;

    private SumOrderRepository sumOrderRepository;

    public TestDataLoader(DrinkRepository drinkRepository, FoodRepository foodRepository, SumOrderRepository sumOrderRepository) {
        this.drinkRepository = drinkRepository;
        this.foodRepository = foodRepository;
        this.sumOrderRepository = sumOrderRepository;
    }

    public void loadData() {

        Food f1 = new Food("test1", 2, 10.1);
        Food f2 = new Food("test2", 3, 12.1);

        Drink d1 = new Drink("Dtest1", 5, 19.99);
        Drink d2 = new Drink("Dtest2", 1, 9.99);

        List<Food> foods = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        foods.add(f1);
        foods.add(f2);
        drinks.add(d1);
        drinks.add(d2);

        SumOrder order = new SumOrder(foods, drinks);

        f1.setSumOrder(order);
        f2.setSumOrder(order);
        d1.setSumOrder(order);
        d2.setSumOrder(order);

        sumOrderRepository.save(order);

        foodRepository.saveAll(Arrays.asList(f1, f2));

        drinkRepository.saveAll(Arrays.asList(d1, d2));

    }
}

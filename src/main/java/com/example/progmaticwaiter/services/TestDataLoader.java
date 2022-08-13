package com.example.progmaticwaiter.services;

import com.example.progmaticwaiter.models.Drink;
import com.example.progmaticwaiter.models.Food;
import com.example.progmaticwaiter.models.SumOrder;
import com.example.progmaticwaiter.repositories.SumOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDataLoader {

    private SumOrderRepository sumOrderRepository;

    public TestDataLoader(SumOrderRepository sumOrderRepository) {
        this.sumOrderRepository = sumOrderRepository;
    }

    public void loadData() {

        Food f1 = new Food("Gulyás", 2, 10.1);
        Food f2 = new Food("Pörkölt", 3, 12.1);
        Food f3 = new Food("Mákosguba", 1, 13.1);
        Food f4 = new Food("Pásztortarhonya", 2, 14.1);
        Food f5 = new Food("Húsleves", 1, 12.7);
        Food f6 = new Food("Paprikás krumpli", 2, 10.5);
        Food f7 = new Food("Székelykáposzta", 3, 12.9);
        Food f8 = new Food("Rántott hús krumplival", 1, 21.1);
        Food f9 = new Food("Oldalas rizzsel", 1, 17.1);


        Drink d1 = new Drink("Coca Cola", 2, 19.99);
        Drink d2 = new Drink("Fanta", 3, 15.99);
        Drink d3 = new Drink("Sprite", 2, 9.99);
        Drink d4 = new Drink("Víz", 1, 5.99);
        Drink d5 = new Drink("Coca Cola", 4, 19.99);
        Drink d6 = new Drink("Fanta", 2, 15.99);
        Drink d7 = new Drink("Fanta", 1, 15.99);
        Drink d8 = new Drink("Coca Cola", 3, 19.99);
        Drink d9 = new Drink("Sprite", 1, 9.99);

        List<Food> foods = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        List<Food> foods2 = new ArrayList<>();
        List<Drink> drinks2 = new ArrayList<>();

        List<Food> foods3 = new ArrayList<>();
        List<Drink> drinks3 = new ArrayList<>();

        foods.add(f1);
        foods.add(f2);
        foods.add(f3);
        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);

        foods2.add(f4);
        foods2.add(f5);
        foods2.add(f6);
        drinks2.add(d4);
        drinks2.add(d5);
        drinks2.add(d6);

        foods3.add(f7);
        foods3.add(f8);
        foods3.add(f9);
        drinks3.add(d7);
        drinks3.add(d8);
        drinks3.add(d9);

        SumOrder order = new SumOrder(foods, drinks);

        SumOrder order2 = new SumOrder(foods2, drinks2);

        SumOrder order3 = new SumOrder(foods3, drinks3);

        f1.setSumOrder(order);
        f2.setSumOrder(order);
        f3.setSumOrder(order);
        d1.setSumOrder(order);
        d2.setSumOrder(order);
        d3.setSumOrder(order);

        f4.setSumOrder(order2);
        f5.setSumOrder(order2);
        f6.setSumOrder(order2);
        d4.setSumOrder(order2);
        d5.setSumOrder(order2);
        d6.setSumOrder(order2);

        f7.setSumOrder(order3);
        f8.setSumOrder(order3);
        f9.setSumOrder(order3);
        d7.setSumOrder(order3);
        d8.setSumOrder(order3);
        d9.setSumOrder(order3);

        sumOrderRepository.save(order);
        sumOrderRepository.save(order2);
        sumOrderRepository.save(order3);

    }
}

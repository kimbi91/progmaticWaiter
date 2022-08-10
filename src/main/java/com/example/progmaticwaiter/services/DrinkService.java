package com.example.progmaticwaiter.services;

import com.example.progmaticwaiter.models.Drink;
import com.example.progmaticwaiter.repositories.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DrinkService {

    private DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public List<Drink> getAll() {
        return new ArrayList<>((Collection) drinkRepository.findAll());
    }

    public Drink saveDrink(Drink drink) {
        drinkRepository.save(drink);

        return drink;
    }
}

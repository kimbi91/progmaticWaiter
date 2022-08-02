package com.example.progmaticwaiter.repository;

import com.example.progmaticwaiter.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
}

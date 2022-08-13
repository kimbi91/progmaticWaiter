package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

}

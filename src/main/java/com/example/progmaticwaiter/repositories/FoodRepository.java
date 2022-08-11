package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.Food;
import com.example.progmaticwaiter.models.SumOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {

    @Query("SELECT f FROM Food f WHERE f.sumOrder.id = ?1")
    List<Food> getFoodsByOrderId(Long id);
}

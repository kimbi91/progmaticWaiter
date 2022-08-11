package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.Drink;
import com.example.progmaticwaiter.models.Food;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {

    @Query("SELECT d FROM Drink d WHERE d.sumOrder.id = ?1")
    List<Drink> getDrinksByOrderId(Long id);
}

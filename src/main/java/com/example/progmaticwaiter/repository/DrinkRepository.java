package com.example.progmaticwaiter.repository;

import com.example.progmaticwaiter.model.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {
}

package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {

}

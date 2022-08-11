package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.Food;
import com.example.progmaticwaiter.models.SumOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SumOrderRepository extends CrudRepository<SumOrder, Long> {

}

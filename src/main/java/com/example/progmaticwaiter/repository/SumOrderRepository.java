package com.example.progmaticwaiter.repository;

import com.example.progmaticwaiter.model.SumOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumOrderRepository extends CrudRepository<SumOrder, Long> {
}

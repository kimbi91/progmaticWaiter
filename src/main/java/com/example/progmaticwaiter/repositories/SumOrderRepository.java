package com.example.progmaticwaiter.repositories;

import com.example.progmaticwaiter.models.SumOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SumOrderRepository extends CrudRepository<SumOrder, Long> {

}

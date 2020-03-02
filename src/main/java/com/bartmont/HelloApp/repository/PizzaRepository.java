package com.bartmont.HelloApp.repository;

import com.bartmont.HelloApp.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository <Pizza, Long> {
}

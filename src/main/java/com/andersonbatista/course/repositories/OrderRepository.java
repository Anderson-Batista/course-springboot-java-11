package com.andersonbatista.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersonbatista.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

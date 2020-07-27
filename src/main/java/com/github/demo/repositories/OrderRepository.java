package com.github.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

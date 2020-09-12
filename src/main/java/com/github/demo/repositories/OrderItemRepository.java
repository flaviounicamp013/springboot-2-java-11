package com.github.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

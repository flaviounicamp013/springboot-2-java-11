package com.github.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

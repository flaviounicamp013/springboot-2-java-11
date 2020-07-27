package com.github.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

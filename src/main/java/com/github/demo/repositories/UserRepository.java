package com.github.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

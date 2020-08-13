package com.javainuse.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
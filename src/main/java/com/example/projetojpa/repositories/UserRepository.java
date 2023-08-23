package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetojpa.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
}

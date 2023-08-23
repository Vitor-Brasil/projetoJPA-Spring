package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetojpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

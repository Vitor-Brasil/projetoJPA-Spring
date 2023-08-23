package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetojpa.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}

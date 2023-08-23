package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetojpa.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

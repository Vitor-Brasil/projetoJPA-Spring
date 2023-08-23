package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetojpa.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}

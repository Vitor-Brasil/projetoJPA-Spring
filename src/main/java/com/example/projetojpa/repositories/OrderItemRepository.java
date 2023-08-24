package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetojpa.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

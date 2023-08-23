package com.example.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetojpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

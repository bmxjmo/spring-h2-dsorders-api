package com.devsuperior.dsorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsorders.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

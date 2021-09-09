package com.devsuperior.dsorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsorders.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

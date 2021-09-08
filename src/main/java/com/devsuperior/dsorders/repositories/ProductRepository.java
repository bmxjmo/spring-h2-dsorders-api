package com.devsuperior.dsorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsorders.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.devsuperior.dsorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsorders.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

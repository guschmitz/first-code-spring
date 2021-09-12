package com.schmitz.saleSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schmitz.saleSpring.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}

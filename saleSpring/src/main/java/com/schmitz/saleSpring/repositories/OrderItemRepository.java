package com.schmitz.saleSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schmitz.saleSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}

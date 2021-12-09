package com.gabriel.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.course.entities.Order;
import com.gabriel.course.repositories.OrderRepository;


@Service
public class OrderSevice {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> Order = repository.findById(id);
		return Order.get();
	}
	
}

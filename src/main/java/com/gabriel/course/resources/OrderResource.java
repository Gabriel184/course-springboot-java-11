package com.gabriel.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.course.entities.Order;
import com.gabriel.course.services.OrderSevice;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderSevice OrderSevice; 
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = OrderSevice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order o = OrderSevice.findById(id);
		return ResponseEntity.ok().body(o);
	}
	
}

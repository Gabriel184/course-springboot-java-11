package com.gabriel.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.course.entities.Category;
import com.gabriel.course.services.CategorySevice;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategorySevice categorySevice; 
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categorySevice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category c = categorySevice.findById(id);
		return ResponseEntity.ok().body(c);
	}
	
}

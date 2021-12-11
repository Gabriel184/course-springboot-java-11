package com.gabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

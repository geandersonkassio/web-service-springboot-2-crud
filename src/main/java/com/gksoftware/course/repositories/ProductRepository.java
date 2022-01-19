package com.gksoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gksoftware.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

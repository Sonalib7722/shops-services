package com.sb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.model.Products;

public interface ProductRepository extends JpaRepository<Products, String> {

}

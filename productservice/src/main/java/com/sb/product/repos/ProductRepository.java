package com.sb.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.product.model.Products;

public interface ProductRepository extends JpaRepository<Products, String> {

}

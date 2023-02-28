package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.Products;
import com.sb.repos.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/getproducts",method=RequestMethod.GET)
	public List<Products> getCertificationsList() {
		return repository.findAll();
	}
}

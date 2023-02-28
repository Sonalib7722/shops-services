package com.sb.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.product.model.Products;
import com.sb.product.repos.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping("/get")
	public String getmessage() {
		return "yayayy";
	}
	
	@RequestMapping(value="/getproducts",method=RequestMethod.GET)
	public List<Products> getproductList() {
		return repository.findAll();
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public Products saveProduct(@RequestBody Products product) {
		return repository.save(product);
	}
	
	@RequestMapping(value="/getproductdetails/{productid}",method=RequestMethod.GET)
	public Products getProductDetails(@PathVariable String productid) {
		return repository.findById(productid).get();
	}
}

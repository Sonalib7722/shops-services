package com.sb.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {

	@GetMapping("/get")
	public String getData() {
		return "Welcome to demo page new change........";
	}
}

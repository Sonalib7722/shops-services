package com.sb.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.customer.model.Customers;
import com.sb.customer.repos.CustomerRepository;


@RestController
@RequestMapping(value="/customerapi")
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(value="/getcustomers",method=RequestMethod.GET)
	public List<Customers> getCustomerList() {
		return repository.findAll();
	}

	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public Customers addCustomers(@RequestBody Customers customers) {
		return repository.save(customers);
	}
	
	@RequestMapping(value="/getcustomerdetails/{customerid}",method=RequestMethod.GET)
	public Customers getCustomerDetails(@PathVariable String customerid) {
		return repository.findById(customerid).get();
	}
}

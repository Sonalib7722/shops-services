package com.sb.customer.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.customer.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, String> {

}

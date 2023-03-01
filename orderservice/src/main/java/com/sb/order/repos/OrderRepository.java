package com.sb.order.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.order.model.Orders;


public interface OrderRepository extends JpaRepository<Orders, Integer> {

}

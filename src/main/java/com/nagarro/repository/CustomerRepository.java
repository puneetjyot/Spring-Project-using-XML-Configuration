package com.nagarro.repository;

import java.util.List;

import com.nagarro.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
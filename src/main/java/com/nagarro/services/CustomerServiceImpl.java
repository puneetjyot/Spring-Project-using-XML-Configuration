package com.nagarro.services;

import java.util.List;

import com.nagarro.model.Customer;
import com.nagarro.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	
	CustomerServiceImpl(CustomerRepository customerrepository)
	{
		this.customerRepository=customerrepository;
	}
	
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll(){ 
		return customerRepository.findAll();
	}

	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}

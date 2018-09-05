package com.nagarro.repository;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.nagarro.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers=new ArrayList<>();
		
		Customer customer=new Customer();
		customer.setFirstname("Puneet");
		customer.setLastname("jyot");
		
		customers.add(customer);
		
		return customers;
	
	
	
	
	}
	
	
}

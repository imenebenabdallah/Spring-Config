package com.invivoo.repository;

import java.util.ArrayList;
import java.util.List;

import com.invivoo.model.Customer;

public class CustomerRespositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.invivoo.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");

		customers.add(customer);

		return customers;
	}
}

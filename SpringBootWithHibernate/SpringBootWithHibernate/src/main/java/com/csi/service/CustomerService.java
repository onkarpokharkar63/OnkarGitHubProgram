package com.csi.service;

import java.util.List;

import com.csi.model.Customer;

public interface CustomerService {

	public void saveData(Customer customer);
	
	public List<Customer>getAllData();


}

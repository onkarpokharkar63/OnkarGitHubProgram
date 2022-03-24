package com.csi.dao;

import java.util.List;

import com.csi.model.Customer;

public interface CustomerDao {
	
	public void saveData(Customer customer);
	
	public List<Customer>getAllData();

}

package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDaoimpl;

	@Override
	public void saveData(Customer customer) {
		// TODO Auto-generated method stub
		customerDaoimpl.saveData(customer);

	}

	@Override
	public List<Customer> getAllData() {
		// TODO Auto-generated method stub
		return customerDaoimpl.getAllData();
	}

}

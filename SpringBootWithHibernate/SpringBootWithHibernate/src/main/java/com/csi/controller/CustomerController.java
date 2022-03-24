package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import com.csi.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api")

public class CustomerController {

	
	@Autowired
	CustomerService customerServiceImpl;
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Customer customer) {
		
		customerServiceImpl.saveData(customer);
		return "Save data Sucssefully";
	}
	@GetMapping("/getdata")
	public List<Customer>getAllData()
	{
		return customerServiceImpl.getAllData();
	}
}

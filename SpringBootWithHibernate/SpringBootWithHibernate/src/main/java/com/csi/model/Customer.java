package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	
	private int custId;
	
	private String custName;
	
	private String custAddress;
	
	private long custContactNo;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public long getCustContactNo() {
		return custContactNo;
	}

	public void setCustContactNo(long custContactNo) {
		this.custContactNo = custContactNo;
	}
	
	

}

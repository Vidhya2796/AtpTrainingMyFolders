package com.vidhyac.beans.customerDetails;

public class Customer {
	//customerId, customerName, customerContact, customerAddress.
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
public Customer(int customerId, String customerName, long customerContact,
			Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}	
	
	public void showCustDetails() {
		System.out.println("Customer Name "+getCustomerName());
		System.out.println("Customer Id "+getCustomerId());
		System.out.println("Customer Contact "+getCustomerContact());
		System.out.println("Customer Address "+getCustomerAddress());

	}

	
	
	
	}



package com.vidhyac.lamb;

public class Order {
	double price;
	String status;
	public Order(double price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}
	
	//lambda expressions
	
	
}

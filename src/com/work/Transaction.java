package com.work;

public class Transaction {
	private String date;
	private double amount,currentBalance;
	private String type;
	
	
	//Constructor
	public Transaction(String date, double amount, double currentBalance,String type) {
		this.date = date;
		this.amount = amount;
		this.currentBalance = currentBalance;
		this.type = type;
	}

	//Getters 
	public String getDate() {
		return date;
	}
	public double getAmount() {
		return amount;
	}
	public String getType() {
		return type;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	
}

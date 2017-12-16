package com.work;

public class Account {
	private double balance;

	//Method to add Balance, referred in Client
	public void addBalance(double balance) {
		this.balance += balance;
	}
	//Method to remove Balance, also referred in Client
	public void removeBalance(double balance) {
		this.balance -= balance;
	}
	//Construcot and Getter
	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}

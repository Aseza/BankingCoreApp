package com.work;

public class Account {
	private double balance;

	public void addBalance(double balance) {
		this.balance += balance;
	}
	public void removeBalance(double balance) {
		this.balance -= balance;
	}

	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}

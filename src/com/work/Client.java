package com.work;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	private String name;
	private Account account;
	private List<Transaction> transactions;

	//Constructor
	public Client(String name, double balance) {	
		this.name = name;
		account = new Account(balance);
		transactions = new ArrayList<>();
	}
	
	//Method to add money to account
	public void addMoneyToAccount(double money) {
		account.addBalance(money);
		System.out.println("Adding " + money +" To "+this.toString()+" and his/her balance is: "+ account.getBalance() );

	}
	
	//Method to remove money to account
	public boolean withdrawMoneyFromAccount(double money) {
		if (account.getBalance() < money) {
			System.out.println("Sorry, you can't move that much money, try less?");
			return false;
		} else {
			account.removeBalance(money);
			System.out.println("Withdrawing " + money +" from "+this.toString()+" and his/her balance is: "+ account.getBalance() );
			return true;
		}
	}
	//Make a transaction of type: Deposit
	public void makeDepositTransaction(Client cl, double amount) {
		System.out.println("\n-------Transaction OF "+cl.getName()+" and "+this.getName()+"--------");
		if(!withdrawMoneyFromAccount(amount)) {System.out.println("Can't perform transaction, amount too big"); return;}
		cl.addMoneyToAccount(amount);
		String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		transactions.add(new Transaction(todayDate, amount,getAccount().getBalance(),"deposit"));
		System.out.println("---------------------------------------");


	}
	
	//Make a transaction of type: Withdrawal
	public void makeWithdrawTransaction(Client cl, double amount) {
		System.out.println("\n-------Transaction OF "+cl.getName()+" and "+this.getName()+"--------");
		if(!cl.withdrawMoneyFromAccount(amount)) {System.out.println("Can't perform transaction, amount too big"); return;}
		addMoneyToAccount(amount);
		String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		transactions.add(new Transaction(todayDate, amount, getAccount().getBalance(),"withdrawal"));
		System.out.println("---------------------------------------");

	}
	
	//Method to show transactions by date.
	//Make sure format is "yyyy-MM-dd" !!
	public void showFilteredTransactionsByDate(String date) {
		boolean found = false;
		System.out.println("\nShowing transactions of the date: "+ date);

		for (Transaction transaction : transactions) {
			if(transaction.getDate().equals(date)){
				found = true;
				System.out.println("Transaction of amount "+ transaction.getAmount()+" and balance was: "+transaction.getCurrentBalance());
			}
		}
		System.out.println("\n");
		if(!found ) System.out.println("Sorry, No Transactions on that date :(");

	}
	//Method to show transactions by type/direction.
	//Please make sure direction is either "withdrawal" or "deposit"
	public void showFilteredTransactionsByDirection(String direction) {
		boolean found = false;
		System.out.println("\nShowing transactions of type: "+ direction);
		for (Transaction transaction : transactions) {
			if(transaction.getType().equals(direction)){
				found = true;
				System.out.println("Transaction of amount "+ transaction.getAmount()+" and balance was: "+transaction.getCurrentBalance());
			}
		}
		System.out.println("\n");
		if(!found )System.out.println("Sorry, No Transactions of that type :(");
	}
	
	
	
	//Getters and toString overriden.
	public Account getAccount() {
		return account;
	}
	public double getBalance(){
		return account.getBalance();
	}
	@Override
	public String toString() {
		return getName();
	}
	public String getName() {
		return name;
	}

}

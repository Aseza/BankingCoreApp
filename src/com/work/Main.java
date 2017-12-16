package com.work;

public class Main {

	public static void main(String[] args) {
		Client cl1 = new Client("Mark", 10);
		Client cl5 = new Client("Lisa", 300);

		System.out.println("Mark balance: " + cl1.getBalance());
		
		 cl1.makeDepositTransaction(cl5, 10);
		
		 cl1.makeWithdrawTransaction(cl5, 150);
		 
		 cl1.showFilteredTransactionsByDate("2017-12-16");


	
	}

}

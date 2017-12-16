# BankingCoreApp
A banking core dummy app, can perform certain operations between clients, like adding, removing balance, or performing transactions

--------------------
Please Note, There a lot of "System.out.println()" to print to the console for easiness.
Some methods are explained with comments
The app was created in the timeslot of approxiamtely 1h45min, the rest was just to make sure everything is working properly.
For any other issue contact on AbdelilahOuchani3245@gmail.com


PS: Apparently I omitted the method that shows the Transaction regardless of the condition(direction, date), sorry about that :)
Could be something like this :
```
public void showAllTransactions() {
		for (Transaction transaction : transactions) {
	System.out.println("Transaction of amount "+ transaction.getAmount()+" and balance was+" transaction.getCurrentBalance());
		}
	}
  ```
  Sorry again :).

package com.app.dd;

public class Account {
 double balance;
int accountNo;
float interestRate;
 int Amount =0;
public void deposit(double balance, int accountNo){
	this.balance=+balance;
	this.accountNo=+accountNo;
}
public void withdraw(int Amount ,double balance){
	this.accountNo=+accountNo;
	this.balance=+balance;
	if(balance<Amount){
		System.out.println("Total Amount"+balance);
	}
}
private void display() {
	System.out.println("balance"+balance);
	System.out.println("accountNo"+accountNo);
	System.out.println("Amount "+Amount);
	System.out.println("interestRate"+interestRate);
	
}
}
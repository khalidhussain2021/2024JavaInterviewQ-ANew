package com.hussainIT.interview.absent;
//Oberservation on the code the java given the appropriated solution the given options to get the below output
public class QuestionNo50 {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(1000.0);
		account.balance=1500.0;
		System.out.println("Update balance : "+account.getBalance());
	}

}
class BankAccount {
	private double balance;
//	public double balance;
	
	public BankAccount(double initialBalance) {
		balance=initialBalance;
	}
	
	public void setBalance(double newBalance) {
		balance=newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
}

//change private double balance to public double balance in the BankAccount class 

//
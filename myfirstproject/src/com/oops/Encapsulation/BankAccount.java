package com.oops.Encapsulation;

public class BankAccount {
	private String accountHolderName;
	private int accountNumber;
	private double balance;

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;

	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public int getaccountNumber() {
		return accountNumber;
	}

	public void setbalance(double balance) {
		this.balance = balance;

	}

	public double getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountHolderName("thrisha");
		b.setbalance(50000.0);

		System.out.println(b.getAccountHolderName());
		System.out.println(b.getaccountNumber());
		System.out.println(b.getbalance());

	}

}

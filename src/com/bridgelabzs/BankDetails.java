package com.bridgelabzs;

import java.util.ArrayList;
import java.util.Scanner;

public class BankDetails {
	Scanner sc =new Scanner(System.in);
	private String accountNo;
	private String name;
	private String accountType;
	private long depositeAmount;
	private long balance;
	private long minimumBalance;
	private long debitAmount;
	
	
	public BankDetails(String accountNo, String name, String accountType,long depositeAmount, long balance,
			long minimumBalance,long debitAmount) {
			super();
			this.accountNo = accountNo;
			this.name = name;
			this.accountType = accountType;
			this.balance = balance;
			this.minimumBalance= minimumBalance;
			this.depositeAmount =depositeAmount;
			this.debitAmount=debitAmount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(long depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(long minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public long getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(long debitAmount) {
		this.debitAmount = debitAmount;
	}
	//creating  method

	/*public void debit() {
	
		System.out.println("Enter the money that you want to Debited");
		debitAmount =sc.nextLong();

		}
   
	public BankDetails(long debitAmount) {
		super();
		this.debitAmount = debitAmount;
	}
	*/
	
}


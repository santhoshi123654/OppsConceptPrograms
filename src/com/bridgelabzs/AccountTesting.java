package com.bridgelabzs;

import java.util.Scanner;

public class AccountTesting {
	 
public static void main(String[] args) {
		
		System.out.println("Welcome to Bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number :");
		String accountNo=sc.nextLine();
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the Account Type :");
		String accountType=sc.nextLine();
		System.out.println("Enter the Deposited Amount Balance :");
		long depositeAmount = sc.nextLong();
		System.out.println("Enter the Balance Amount :");
		long balance = sc.nextLong();
		System.out.println("Enter the Minimum Balance :");
		long minimumBalance = sc.nextLong();
		System.out.println("Enter the Debit Amount :");
		long debitAmount = sc.nextLong();
		
	
	BankDetails details = new BankDetails(accountNo, name, accountType, depositeAmount, balance
			, minimumBalance, debitAmount);
	
	if(balance > debitAmount) {
		
		System.out.println("Money can be Withdrawn");
	}
	else if(debitAmount >= minimumBalance) {
		
		System.out.println("Withdrawl amount is exceeded account balance");			
	}

	else {
			System.out.println("Your balance is less than "+debitAmount+ "Transaction Failed");
		}
	
	}
}

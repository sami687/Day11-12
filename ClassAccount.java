package com.bl.objectorientedprogram;
import java.util.Scanner;

public class ClassAccount {
	static Scanner sc = new Scanner(System.in);

	private static void debit(int accountBalance) {
		int exitFlag = 1;
		while(exitFlag != 0) {
			System.out.println("Enter the amount you want to debit: ");
			int debitAmount = sc.nextInt();
			if(debitAmount > accountBalance)
				System.out.println("Debit Amount exceeds Account Balance! \nPlease try again!\n");
			else {
				accountBalance = accountBalance - debitAmount;
				System.out.println("Remaning account balance is: " +accountBalance);
				exitFlag = 0;
			}
		}
	}
	public static void main( String[] args ){
		System.out.println("Enter the Account Balance: ");
		int accountBalance = sc.nextInt();
		debit(accountBalance);
	}
}


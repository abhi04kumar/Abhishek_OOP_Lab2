package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoney {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
				
		//Input value of size of transaction array from user
		System.out.println("Enter the size of transaction array");
		int size = scan.nextInt();
		
		//Initialization of transaction array
		int[] transactionArr = new int[size];
		
		System.out.println("Enter values of array");
		
		//Inputting values of transactions from user
		for(int i=0; i<size; i++) 
			transactionArr[i] = scan.nextInt();
		
		//Inputting value of total number of transaction targets from user
		System.out.println("Enter the total number of targets to be achieved");
		int target = scan.nextInt();
		
		implOfPayMoney(transactionArr, size, target);
	}
	
	public static void implOfPayMoney(int[] transactionArr, int size, int target) {
	
		//Taking input of each transaction target from user 
		for(int i=1; i<=target; i++) {
			System.out.println("Enter value of target");
			int targ = scan.nextInt();
			int sumOfTransactions=transactionArr[0];
			int check=0;
			
			if(targ<=sumOfTransactions)
				System.out.println("Target achieved after 1 transaction");
			
			else {
			for(int j=1; j<size; j++) {
				sumOfTransactions+=transactionArr[j];
				if(targ<=sumOfTransactions) {
					check=1;
					System.out.println("Target achieved after " + (j+1) + " transactions");
					break;
				}
			}
			
			if(check==0)
				System.out.println("Target is not achieved");
			}
		}
	}
}
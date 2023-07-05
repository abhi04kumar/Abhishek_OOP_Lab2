package com.greatlearning.currency;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenomination {
	
	static Scanner scan = new Scanner(System.in);//Declaration of static Scanner object
	
	
	//Driver Function
	public static void main(String[] args) {
		
		//Taking input of size of denominations from user
		System.out.println("Enter the size of currency denominations");
		int size = scan.nextInt();
		int[] currencyDenomination = new int[size];
		
		//Taking input of random currency denominations from user
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<size; i++)
			currencyDenomination[i] = scan.nextInt();
		
		currencyPayment(currencyDenomination);
	}
	
	//Calculation of Minimum number of notes for payment
	public static void currencyPayment(int[] currency) {
					
		//Taking input of amount to be paid by the user
		System.out.println("Enter the amount you want to pay");		
		int amountToBePaid = scan.nextInt();
		
		//Creation of object of class MergeSort
		MergeSort obj = new MergeSort();
		
		//Calling function from class MergeSort to sort array of random denomination
		obj.sortArray(currency,0,currency.length);
		
		//System.out.println(Arrays.toString(currency));
		
		//Declaration of array for calculating minimum number of notes for each denomination and their sum
		int[] noOfEachNote = new int[currency.length];
		int sumOfNotes=0;
		
		for(int i=currency.length-1; i>=0; i--) {
			if(amountToBePaid>0) 
				noOfEachNote[i]=amountToBePaid/currency[i];
			amountToBePaid%=currency[i];
			sumOfNotes+=noOfEachNote[i];
			}
		
		if(amountToBePaid==0) {
			for(int i=currency.length-1; i>=0; i--)
			if(noOfEachNote[i]>0)
			System.out.println(currency[i] + ":" + noOfEachNote[i]);
			System.out.println("The minimum number of notes required for payment are " + sumOfNotes);
		}else
			System.out.println("The amount cannot be paid with the entered denominations");
	}
}
				
		
		


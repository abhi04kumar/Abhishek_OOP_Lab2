package com.greatlearning.currency;

import java.util.Arrays;
import java.util.Scanner;


public class MergeSort{
	
	/*Scanner scan = new Scanner(System.in); 
	public int range = scan.nextInt();
     public int[] array=new int[range];

     public static void main(String[] args){
    	 
     MergeSort obj = new MergeSort();
     obj.implementationOfMergeSort();
     obj.printValues();
     }


     public void implementationOfMergeSort(){
     insertValues();
     sortArray(array, 0, array.length);
     }
     
     public void insertValues(){
    	 
    	 System.out.println("Enter " + range + " values for sorting");
         for(int i=0; i<range; i++){
             System.out.println("Enter " + (i+1) + " value- ");
             array[i] = scan.nextInt();
             
         }
       }*/
     
     public void sortArray(int array[], int s, int e){
        if(e-s==1)
            return;

        int mid = (e+s)/2;
        sortArray(array, s, mid);
        sortArray(array, mid, e);
        conquerArray(array, s, mid, e);
     }
   
     public void conquerArray(int[] array, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s, j=mid, k=0;

        while(i<mid && j<e) {
            if (array[i] < array[j]) {
                mix[k] = array[i];
                i++;
            } else {
                mix[k] = array[j];
                j++;
            }
            k++;
        }
            while(i<mid){
                mix[k] = array[i];
                i++; k++;
            }
            while(j<e){
                mix[k] = array[j];
                j++; k++;
            }
            for(int l=0; l< mix.length; l++) {
                array[s + l] = mix[l];
            }
     }
     
     /*public void printValues(){
         System.out.println("Sorted Array");
         System.out.println(Arrays.toString(array));
     }*/
}


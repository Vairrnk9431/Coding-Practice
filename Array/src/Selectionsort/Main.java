package Selectionsort;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter " +arr.length+" array");
		for(int i=0;i<=arr.length-1;i++) {
			 arr[i]=scan.nextInt();	
		      }
		System.out.println("Array before sorting");
		for(int i=0;i<=arr.length-1;i++) {
			 System.out.print(arr[i]+" ");
			 }
            // method call
		    Selectionsort(arr);
		    System.out.println();
		    System.out.println("Array after sorting");
			for(int i=0;i<=arr.length-1;i++) {
		    System.out.print(arr[i]+" ");
			}   
	      }
	        public static void Selectionsort(int arr[]) {
             //	 logic
	    	int min;
	        int pos;
	        for(int i=0;i<=arr.length-2;i++){
	          min=arr[i];
	          pos=i;
	        for(int j=i+1;j<=arr.length-1;j++){
	          if(arr[j]<min){
	          min=arr[j];
	          pos=j;
	         }     
	       }
            //	 swap
		    int help=arr[i];
            arr[i]=arr[pos];
            arr[pos]=help;
	    }
    }
}
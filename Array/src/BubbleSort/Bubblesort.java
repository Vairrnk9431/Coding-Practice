package BubbleSort;

import java.util.Scanner;

public class Bubblesort {

	    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		   }
		  System.out.println("Before sorting");
		  for(int i=0;i<=arr.length-1;i++) {
		  System.out.print(arr[i]+" ");
			  
		   }
		 System.out.println();
		 for (int i = 0; i<=arr.length-2; i++) { //this loop itretes till 2nd last element
	            for (int j = 0; j<=arr.length-i-2; j++) {//this loop itretes same as ith loop till 2nd last element
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
		System.out.println("Sorted array in ascending order");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}

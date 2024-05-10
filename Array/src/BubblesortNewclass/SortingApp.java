package BubblesortNewclass;

import java.util.Scanner;

public class SortingApp {
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
		  Bubblesort sort=new Bubblesort();
		  sort.bubbleSort(arr);
		  System.out.println();
		  System.out.println("Sorted array in ascending order");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
	    }
	}

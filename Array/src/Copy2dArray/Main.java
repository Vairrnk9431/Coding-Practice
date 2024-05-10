package Copy2dArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the length of 1st array");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
//		storing the contents
		
		int arr1[][]=new int [m][n];
		System.out.println("Enter the elements to store");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();	
				
			 }
		  }
		int arr2[][]=new int [m][n];
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr2[i][j]=arr1[i][j];	
				
				}
		    }
		System.out.println("Array1 contents are");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.println(arr1[i][j]+" ");
			}
			System.out.println();
		  }
		System.out.println("Array2 contents are");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		  }
		}
	}
			
	




package RotateApp;

import java.util.Scanner;

        public class Main {
		    public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int arr[]=new int[scan.nextInt()];
			
			System.out.println("Enter the elements in array");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
			}
			
			System.out.println("Enter the value of k");
			int k=scan.nextInt();
			System.out.println("Original array");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
	         System.out.println();
             RotateApp.rotateclockwise(arr, k);
             System.out.println();
             System.out.println("Anti clockwise Rotation");
	         RotateApp.rotateanticlockwise(k,arr);
	        
	         
	}

}


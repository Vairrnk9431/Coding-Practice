package Sum2dArray;

import java.util.Scanner;

public class Main {

	      public static void main(String[] args) {
	      Scanner scan=new Scanner (System.in);
	      System.out.println("Enter the Length of Array");
	      int m=scan.nextInt();
	      int n=scan.nextInt();
	
    //	storing elements in array 1
	      System.out.println("Enter the elements of array1");
	      int arr1[][]=new int[m][n];
	      for(int i=0;i<=arr1.length-1;i++) {
		  for(int j=0;j<=arr1[i].length-1;j++) {
			arr1[i][j]=scan.nextInt();
		}
	  }
     //	storing elements in array 1
	      System.out.println("Enter the elements of array2");
	      int arr2[][]=new int[m][n];
	      for(int i=0;i<=arr2.length-1;i++) {
	  		for(int j=0;j<=arr2[i].length-1;j++) {
	  			arr2[i][j]=scan.nextInt();
	  		}
	  	 }
      //	      logic here
	      int arr3[][]=new int[m][n];
	      for(int i=0;i<=arr1.length-1;i++) {
	  		for(int j=0;j<=arr1[i].length-1;j++) {
	  		arr3[i][j]=arr1[i][j]+arr2[i][j];
	  		}
	  	 }
          //	      printing array1
	      System.out.println("Array 1 elements");
	      for(int i=0;i<=arr1.length-1;i++) {
	  		for(int j=0;j<=arr1[i].length-1;j++) {
	  			System.out.print(arr1[i][j]+" ");
	  		}
	  		System.out.println();
	  	 }
          //	      printing array2
	      System.out.println("Array 2 elements");
	      for(int i=0;i<=arr2.length-1;i++) {
	  		for(int j=0;j<=arr2[i].length-1;j++) {
	  			System.out.print(arr2[i][j]+" ");
	  		}
	  		System.out.println();
	      }
          //	      Printing array3
	      System.out.println("Array 3 elements");
	      for(int i=0;i<=arr2.length-1;i++) {
	  		for(int j=0;j<=arr2[i].length-1;j++) {
	  			System.out.print(arr3[i][j]+" ");
	  		}
	  		System.out.println();
	  		
	      }
	      
      }
		
  }

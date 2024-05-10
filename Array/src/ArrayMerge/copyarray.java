package ArrayMerge;

import java.util.Scanner;

public class copyarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of Array-1");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the "+ arr1.length+ " elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the Size of Array-2");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the "+ arr2.length+ " elements");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0;
		for(int j=0;j<arr1.length;j++) {
			arr3[i]=arr1[j];
			i++;
		}
		for (int j = 0;j<arr2.length;j++) { // Corrected loop condition
		    arr3[i]=arr2[j];
		    i++;
		}
		System.out.print("Array1--->");
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		System.out.print("Array2--->");
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
		System.out.print("Array3--->");
		for(int j=0;j<arr3.length;j++) {
			System.out.print(arr3[j]+" ");
		}

	}

}

package ArrayRotate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter the elements in array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the value of k");
		int k = scan.nextInt();
		System.out.println("Original array");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		rotateArray(arr, k);
		System.out.println("After rotation");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static void rotateArray(int arr[], int k) {

		for (int j = 1; j <= k; j++) {
			int temp = arr[arr.length - 1]; // giving last array element to temp variable
			for (int i = arr.length - 2; i >= 0; i--) { // this loop is to print from 2nd last array element
				arr[i + 1] = arr[i];// the loop starting from 2nd last element placed in 2nd place from starting to keep the place for last element to come and sit
			}
			arr[0] = temp;// and printing last array element in first
		}
	}

}

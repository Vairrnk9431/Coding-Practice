package ArrayAntiRotate;

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
			int temp = arr[0];
			for (int i = 1; i <= arr.length - 1; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
		}
	}

}
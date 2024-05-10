package BinarySearch;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " Elements");
		for (int i = 0; i <= arr.length - 1; i++) {

			arr[i] = scan.nextInt();

		}
		System.out.println("Enter Key To Search");
		int key = scan.nextInt();
		int res = new BinarySearch().binarySearch(arr, key);

		if (res >= 0) {

			System.out.println("Key Found At the Index " + res);

		}

		else {
			System.out.println("Key Not Found");

		}

	}

}
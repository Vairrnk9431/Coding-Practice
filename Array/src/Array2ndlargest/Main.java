package Array2ndlargest;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the size ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The Largest element in the array is: " + sort(arr));

	}

	public static int sort(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 2];

	}
}

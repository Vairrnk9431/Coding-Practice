package Factorial;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a non-negative integer to calculate its factorial: ");

		// Input validation to ensure a non-negative integer is entered
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter a valid non-negative integer.");
			scanner.next(); // Consume the invalid input
		}

		int number = scanner.nextInt();

		// Check if the entered number is non-negative
		if (number >= 0) {
			long factorial = calculateFactorial(number);
			System.out.println("The factorial of " + number + " is: " + factorial);
		} else {
			System.out.println("Please enter a non-negative integer.");
		}

		scanner.close();
	}

	// Recursive method to calculate factorial
	static long calculateFactorial(int n) {
		// Base case: factorial of 0 is 1
		if (n == 0) {
			return 1;
		} else {
			// Recursive case: n! = n * (n-1)!
			return n * calculateFactorial(n - 1);
		}
	}
}

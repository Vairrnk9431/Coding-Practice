package Character_Frequency;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Read a line of input from the user
		String input = scanner.nextLine();

		// Create an array to store the count of each character (assuming ASCII
		// characters)
		int[] characterCount = new int[256];

		// Iterate through each character in the input string and count its occurrences
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			characterCount[character]++;
		}

		// Iterate through the characterCount array to print the results
		for (int i = 0; i < 256; i++) {
			// Check if the character at index i has occurred at least once
			if (characterCount[i] > 0) {
				// Convert the index i to its corresponding character
				char character = (char) i;

				// Print the character and its frequency
				System.out.println("Character: " + character + " Frequency: " + characterCount[i]);
			}
		}
	}
}

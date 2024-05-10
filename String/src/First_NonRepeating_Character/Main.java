package First_NonRepeating_Character;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		char firstNonRepeatingChar = findFirstNonRepeatingChar(inputString);

		if (firstNonRepeatingChar != '\0') {
			System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
		} else {
			System.out.println("No non-repeating character found in the given string.");
		}
	}

	public static char findFirstNonRepeatingChar(String str) {
		int[] charCount = new int[256];

		// Step 1: Count the occurrences of each character in the string
		for (char ch : str.toCharArray()) {
			charCount[ch]++;
		}

		// Step 2: Find the first non-repeating character
		for (char ch : str.toCharArray()) {
			if (charCount[ch] == 1) {
				return ch;
			}
		}
		return '\0';
	}

}

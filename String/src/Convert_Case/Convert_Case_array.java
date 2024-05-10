package Convert_Case;

import java.util.Scanner;

public class Convert_Case_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scan.nextLine();
		String res = ConversionCase(input);
		System.out.println(res);

	}

	public static String ConversionCase(String input) {
		char charArray[] = input.toCharArray();
		for (int i = 0; i <= charArray.length - 1; i++) {
			char currentChar = charArray[i];
			if (Character.isUpperCase(currentChar)) {
				charArray[i] = Character.toLowerCase(currentChar);
			} else if (Character.isLowerCase(currentChar)) {
				charArray[i] = Character.toUpperCase(currentChar);
			}
		}
		return new String(charArray);
	}

}

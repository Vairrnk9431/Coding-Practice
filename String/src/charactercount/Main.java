package charactercount;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		checker(str);
	}

	    public static void checker(String str) {
		int vowels = 0;
		int consonent = 0;
		int digits = 0;
		int specialcharacter = 0;
		str = str.toLowerCase();
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if ("aeiou".contains(String.valueOf(ch))) {
					vowels++;
				} else {
					consonent++;
				}
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specialcharacter++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonent);
		System.out.println(digits);
		System.out.println(specialcharacter);
	}
}


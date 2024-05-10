package checkAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		if (anagram(str1, str2)) {
			System.out.println("This strings are anagram");
		} else {
			System.out.println("This strings are not anagram");
		}

	}

	public static boolean anagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
}

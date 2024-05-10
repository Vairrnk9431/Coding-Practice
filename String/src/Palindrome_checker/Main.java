package Palindrome_checker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				System.out.println("Palindrome");
				break;
			} else {
				System.out.println("not Palindrome");
				break;
			}
		}
	}
}
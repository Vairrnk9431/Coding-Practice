package Find_the_Longest_Word_in_a_String;

import java.util.Scanner;

public class longestWord_With_method {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String res = longestWord(str);
		System.out.println("Longest word is " + res);

	}

	public static String longestWord(String str) {
		String ch[] = str.split(" ");
		String longestWord = "";
		for (String word : ch) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
}

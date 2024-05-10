package Character_Frequency;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		int[] charactercount = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			charactercount[character]++;
		}
		for (int i = 0; i < 256; i++) {
			if (charactercount[i] > 0) {
				char character = (char) i;
				System.out.println("character :" + character + " frequency " + "frequency :" + charactercount[i]);
			}

		}
	}
}
package Convert_Case;

import java.util.Scanner;

public class Convert_Case_StringBuilder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		String res = convertCase(str);
		System.out.println(res);

	}

	public static String convertCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			} 

		}

		return sb.toString();
	}

	}



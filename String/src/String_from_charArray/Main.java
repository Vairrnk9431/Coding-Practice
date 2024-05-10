package String_from_charArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		char[]charArray=str.toCharArray();
		String res=chararray(charArray);
		System.out.println(res);
		
	}
	public static String chararray(char[]charArray) {
		StringBuilder sb=new StringBuilder();
		for(char c:charArray) {
			sb.append(c);
		}
		return sb.toString();
	}
	
}
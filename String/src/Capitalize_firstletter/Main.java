package Capitalize_firstletter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		String res=change(str);
		System.out.println(res);
		
	}
	public static String change(String str) {
		String[]words=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String word:words) {
			if(!word.isEmpty()) {
				char firstletter=Character.toUpperCase(word.charAt(0));
				String restofletter=word.substring(1).toLowerCase();
				sb.append(firstletter).append(restofletter).append(" ");
			}
		}
		return sb.toString();
	}
}
package Capitalize_firstletter;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=scan.nextLine();
     String res=change(str);
     System.out.println(res);
	}
public static String change(String str) {
	String[]words=str.split(" ");
	StringBuilder sb=new StringBuilder();
	for(String word:words) {
		char currentchar=Character.toUpperCase(word.charAt(0));
		String restcharacter=word.substring(1).toLowerCase();
		sb.append(currentchar).append(restcharacter);
	}
	return sb.toString();
}
}

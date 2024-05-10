package Remove_duplicate_character;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		String res=duplicate(str);
		System.out.println(res);
	  }
	public static String duplicate(String str) {
		StringBuilder result=new StringBuilder();
		boolean[]ch=new boolean[256];
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!ch[c]) {
				result.append(c);
				ch[c]=true;
			}
		}
		return result.toString();
	}
}
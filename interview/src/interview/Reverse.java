package interview;

import java.util.Scanner;

public class Reverse {

	    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		char []ch = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];	
		}
		System.out.println(rev);
	}
}
package interview;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=scan.nextLine();
    boolean vowelsfound=false;
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	
    	if(ch =='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ) {
    		vowelsfound=true;
    		break;
    	}
    }
     if(vowelsfound) {
    	 System.out.println("Vowels found in this string");
     }else {
    	 System.out.println("Vowels Not found in this string");
     }
    
	}

}

package checkAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=scan.nextLine();
		System.out.println("Enter String 2");
		String str2=scan.nextLine();
		boolean res= anagram(str1, str2);
		if(res) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anangram");
		}
	 }
	public static boolean anagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[]charArray1=str1.toCharArray();
		char[]charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
   
    }




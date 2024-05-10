package ReverseString;

import java.util.Scanner;

public class ReverseusingArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scan.nextLine();
        String res=reverse(input);
        System.out.println(res);
    }
	public static String reverse(String str) {
      //	convert string(str)to charArray
		char charArray[]=str.toCharArray();
		for(int i=0,j=charArray.length-1;i<j;i++,j--) {
             //		swapping
			char temp=charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
		}
        //	store back to String
		return new String(charArray);
	}
}

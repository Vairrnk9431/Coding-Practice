package ReverseString;

import java.util.Scanner;

public class ReverseWordofSentences {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scanner.nextLine();
			System.out.println("Entered Sentence is ");
			System.out.println(str);
			String arr[]=str.split(" ");
			String reverseSentence="";
			for(int i=0;i<=arr.length-1;i++){
			String word=arr[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--){

			revWord=revWord+word.charAt(j);

			}
			
			reverseSentence=reverseSentence+revWord+" ";
		 }
			System.out.println("Reversed Word Sentence is ");
			System.out.println(reverseSentence);
		}
}

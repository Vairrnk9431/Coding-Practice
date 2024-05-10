package ReverseString;

import java.util.Scanner;

public class Reverse_as_it_is {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        String res = reverseSentence(str);
        System.out.println(res);
    }

    public static String reverseSentence(String str) {
      String words[]=str.split("\\s+");
      StringBuilder sb=new StringBuilder();
      for(int i=words.length-1;i>=0;i--) {
    	  sb.append(words[i]);
    	  if(i>0) {
    		  sb.append(" ");
    	  }
      }
        
         return sb.toString();
    }
}

package Find_the_Longest_Word_in_a_String;

import java.util.Scanner;

public class LongestWord_without_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String []words=input.split(" ");
        String longestWord="";
        for(String word : words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println(longestWord); 
    }
}
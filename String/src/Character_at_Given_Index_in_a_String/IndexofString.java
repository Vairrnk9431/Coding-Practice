package Character_at_Given_Index_in_a_String;

import java.util.Scanner;

public class IndexofString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        System.out.println("Enter the index");
        int index = scanner.nextInt();
        char res=input.charAt(index);
        System.out.println("Character at index " + index + " is " + res);
    }

    
    
}


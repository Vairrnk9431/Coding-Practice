package ReverseString;

import java.util.Scanner;

public class rev_with_intact_space {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        char arr1[]=input.toCharArray();
	        char arr2[]=new char [arr1.length];
	        for(int i=0;i<arr1.length-1;i++){
	            if(arr1[i]==' '){
	                arr2[i]=arr1[i];
	            }
	        }
	        int j=arr2.length-1;
	        for(int i=0;i<=arr1.length-1;i++){
	           if(arr1[i]!=' '){
	               if(arr2[j]==' '){
	                   j--;
	               }
	               arr2[j]=arr1[i];
	               j--;
	           }
	        }
	        input=new String (arr2);
	        System.out.println(input);
	      
	    
	   
	}

}

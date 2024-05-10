package LinearSearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of array");
    int arr[]=new int[scan.nextInt()];
    System.out.println("Enter the array elements");
    for(int i=0;i<=arr.length-1;i++) {
    	 arr[i]=scan.nextInt(); 
    }
    System.out.println("Enter key to search");
    int key=scan.nextInt();
    for(int i=0;i<=arr.length-1;i++) {
    	if(key==arr[i]) {
    System.out.println("KEY FOUND AT "+i);
    return;
    	  }
    	}
    System.out.println("Key not found");
    
    }
    
}



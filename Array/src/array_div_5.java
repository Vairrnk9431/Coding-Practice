import java.util.Scanner;

public class array_div_5 {

	public static void main(String[] args) {
		System.out.println("Enter the elements");
		Scanner scan=new Scanner (System.in);
	    int arr[]=new int[scan.nextInt()];
	    for(int i=0;i<=arr.length-1;i++) {
	    	 arr[i]=scan.nextInt();	
	    }
	    for(int i=0;i<=arr.length-1;i++) {
	   	 if(arr[i]%5==0) {
	   		 System.out.print(arr[i]+" | ");
	   		 
	   	 }else {
	   		 System.out.println("error");
	   		 break;
	   	 }
	   }

	}

}
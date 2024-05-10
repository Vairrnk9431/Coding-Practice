import java.util.Scanner;

public class Array3Dregular {

	  public static void main(String[] args) {
	  Scanner scan =new Scanner(System.in);
	  System.out.println("Enter the length of 3d regular array");
	  int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	  
	  for(int i=0;i<=arr.length-1;i++) {
		  for(int j=0;j<=arr[i].length-1;j++) {
			  for(int k=0;k<=arr[i][j].length-1;k++) {
				  
				  System.out.println("Enter the Elements ");
				  arr[i][j][k]=scan.nextInt();
				  
			   }
		   }    
	   }
	  System.out.println("Array elements are");
	  for(int i=0;i<=arr.length-1;i++) {
		  for(int j=0;j<=arr[i].length-1;j++) {
			  for(int k=0;k<=arr[i][j].length-1;k++){
				  System.out.print(arr[i][j][k]+" ");
				  
			  }
	         System.out.println();
		   }
		  System.out.println();
	   }
	  
	  }

}

import java.util.Scanner;

public class Array2jagged {

	public static void main(String[] args) {
		    Scanner scan=new Scanner (System.in);
		    System.out.println("Enter length of 1st Dimension");
		    int[][]arr=new int [scan.nextInt()][];
		
		    for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter 2D length of 1st Demension"+i);
			arr[i]= new int[scan.nextInt()];
			
		    }
		
		    System.out.println("");
		    for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter an element");
			arr[i][j]=scan.nextInt();
			
		    }
			
		  }
		   System.out.println("Array element are");
		   for(int i=0;i<=arr.length-1;i++) {
		   for(int j=0;j<=arr[i].length-1;j++) {
			System.out.print(arr[i][j]+" ");
			
		   }
			System.out.println();
		}
		
	}

}

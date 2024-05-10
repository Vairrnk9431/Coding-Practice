import java.util.Scanner;

public class Array3JAGGED {

	    public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	    System.out.println("Enter length of 1st Dimension 3d jagged array");
	    int arr[][][]=new int[scan.nextInt()][][];
	    System.out.println("Enter 2nd Lengths");
	    
	    for(int i=0;i<=arr.length-1;i++) {	
	    System.out.println("Enter 2D length for 1D "+i);
	    arr[i]=new int [scan.nextInt()][];
	    
	    }
	    System.out.println("Enter 3d lengths");
	    for(int i=0;i<=arr.length-1;i++) {	
	    	 for(int j=0;j<=arr[i].length-1;j++) {	
	    		 System.out.println("Enter 3rd D length for 1st D "+i+" 2D "+j);
	    		 arr[i][j]=new int[scan.nextInt()];
	    		 
	    	 }
	    }
	    for(int i=0;i<=arr.length-1;i++) {	
	    	 for(int j=0;j<=arr[i].length-1;j++) {	
	    		 for(int k=0;k<=arr[i][j].length-1;k++) {
	    		 System.out.println("Enter the elements");
	    		 arr[i][j][k]=scan.nextInt();	    
	    		 
	    		}  
	        }
	    }
	    
	    System.out.println("Array contents are....");
	    for(int i=0;i<=arr.length-1;i++) {	
	    	 for(int j=0;j<=arr[i].length-1;j++) {	
	    		 for(int k=0;k<=arr[i][j].length-1;k++) {
	    			 System.out.print(arr[i][j][k]+" ");
	    		 }
	    		 System.out.println();
	    	 }
	    	 System.out.println();
	    }
	    
	}

}

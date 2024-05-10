import java.util.Scanner;

public class ArraySum {

	    public static void main(String[] args){
	    System.out.println("Enter the array length");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++){
			sum+=arr[i];
		}
       System.out.println("Sum of Array Elements are "+sum);
	}

}

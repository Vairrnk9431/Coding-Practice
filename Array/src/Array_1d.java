import java.util.Scanner;

public class Array_1d {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]arr=new int[3];
		
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter an element "+i);
		arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" | ");
		}
		
    }
}

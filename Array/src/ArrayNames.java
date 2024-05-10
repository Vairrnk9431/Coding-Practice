import java.util.Scanner;

public class ArrayNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[]arr=new String[8];
		
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter the names");
		arr[i]=scan.next();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

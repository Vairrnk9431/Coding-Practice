
import java.util.*;

public class LargestElement {

	public static void main(String args[]) {
		System.out.println("Enter the length");
        Scanner scan=new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Largest element in the array is: " + findLargestElement(arr));
	
	}

	public static int findLargestElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

package pp;
import java.util.Scanner;
public class bubblee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the Elements of array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println("Array before sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; i++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("Array after sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}

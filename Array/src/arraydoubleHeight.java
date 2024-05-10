import java.util.Scanner;

public class arraydoubleHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Double[] arr = new Double[10];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the height" + i);
			arr[i] = scan.nextDouble();
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

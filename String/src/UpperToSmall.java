import java.util.Scanner;

public class UpperToSmall {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String converted = convertCase(input);
		System.out.println(converted);
	}

	public static String convertCase(String input) {
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (temp >= 65 && temp <= 90) {
				// Convert uppercase to lowercase
				temp = temp + 32;
			} else if (temp >= 97 && temp <= 122) {
				// Convert lowercase to uppercase
				temp = temp - 32;
			}
			arr[i] = (char) temp;
		}
		return new String(arr);
	}
}

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = new String(scan.nextLine());
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				String substring = str.substring(i, j);
				System.out.println(substring);
			}
		}

	}

}

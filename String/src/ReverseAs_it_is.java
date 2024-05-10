import java.util.Scanner;

public class ReverseAs_it_is {
	public static void main(String[] args) {
		System.out.println("Enter the sentence:");
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String reversedSentence = reverseSentence(sentence);
		System.out.println("Reversed sentence:");
		System.out.println(reversedSentence);
	}

	public static String reverseSentence(String sentence) {
		String[] arr = sentence.split(" "); // Split the sentence into words
		StringBuilder reversed = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			reversed.append(arr[i]);
			if (i > 0) {
				reversed.append(" ");
			}
		}

		return reversed.toString();
	}
}

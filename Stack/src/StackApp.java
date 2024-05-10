import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do You Wish To Create An Stack ? say true or false");
		boolean choice = scan.nextBoolean();
		if (choice == true) {
			System.out.println("Enter Stack Length");
			int n = scan.nextInt();
			Stack s = new Stack(n);
			while (true) {

				System.out.println("Press 1----> PUSH");
				System.out.println("Press 2----> POP");
				System.out.println("Press 3----> DISPLAY");
				System.out.println("Any Other Number ----> STOP");
				System.out.println("Enter your choice");
				int ch = scan.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter Element to push");
					int elem = scan.nextInt();
					s.push(elem);
					break;

				case 2:
					s.pop();
					break;

				case 3:
					s.display();
					break;

				default:
					System.out.println("TATA BYE BYE...");
					return;

				}

			}

		}

	}
}

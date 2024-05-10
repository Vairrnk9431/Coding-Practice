package ImplentationOfArray;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wish to create an array ? Say True or False");
		boolean choice = scan.nextBoolean();
		if (choice == true)

		{

			System.out.println("Enter Array Length");

			int n = scan.nextInt();

			Array array = new Array(n);

			while (true)

			{

				System.out.println("Press 1----> INSERT");

				System.out.println("Press 2----> DELETE");

				System.out.println("Press 3----> DISPLAY");

				System.out.println("Any Other Number ----> STOP");

				System.out.println("Enter your choice");

				int ch = scan.nextInt();

				switch (ch) {

				case 1:
					array.insert();

					break;

				case 2:
					array.delete();

					break;

				case 3:
					array.display();

					break;

				default:
					System.out.println("TATA BYE BYE...");

					return;

				}

			}

		}

	}
}

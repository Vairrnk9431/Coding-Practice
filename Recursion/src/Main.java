import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the n number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		fact fact=new fact();
		int res= fact.factorial(n);
		System.out.println(res);

	}

}

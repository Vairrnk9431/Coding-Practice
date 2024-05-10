package gcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		Gcd gcd=new Gcd();
		int res =gcd.GreatestCommonDivisior(num1, num2);
		System.out.println(res);
		
	}

}

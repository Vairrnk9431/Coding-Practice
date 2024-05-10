package pp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1=scan.nextInt();
		System.out.println("Enter the Second number");
		int num2=scan.nextInt();
		int res=findgcd(num1, num2);
		System.out.println(res);
		
		
		
	}
	public static int findgcd(int a,int b) {
		while(b!=0) {
			int rem=b;
			b=a%b;
			a=rem;
		}
		return a;
	}

}

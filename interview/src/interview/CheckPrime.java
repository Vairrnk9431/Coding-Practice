package interview;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			isPrime=false;
			break;
		}
		if(isPrime && num>1) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime");
		}

	}

}

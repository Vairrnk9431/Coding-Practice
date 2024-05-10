package pp;

import java.util.Scanner;

public class Armo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int power=isArmo.getCount(num);
	int res=isArmo.getSum(num, power);
	if(res==num) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}

package pp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int original=n;
		int rev=0;
		while(n>0) {
			int ld=n%10;
			rev=rev*10+ld;
			n/=10;
		}
		if(original==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}

}
}
package pp;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int original=n;
		int rev=0;
		while(n>0) {
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		if(original==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}

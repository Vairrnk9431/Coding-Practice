package pp;

import java.util.Scanner;

public class Arm {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int original=num;
	int sum=0;
	while(num!=0) {
		int ld=num%10;
		int drp=(int)Math.pow(original, ld);
	    sum+=drp;
	    num/=num/10;  
	}
	
}
}

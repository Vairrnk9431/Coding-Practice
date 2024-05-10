package interview;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	int count=0;
	for(int i=0;i<num;i++) {
		count++;
	}
	System.out.println(num);
}
}

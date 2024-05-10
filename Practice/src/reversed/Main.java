package reversed;

import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int reversedNum=revNum(num);
	System.out.println("Reversed number: "+reversedNum);
	
	}
	public static int revNum(int num) {
		int reversed=0;
		while(num!=0) {
			int lastdigit=num%10;
			reversed=reversed*10+lastdigit;
			num/=10;
		}
		return reversed;
}
	    

}

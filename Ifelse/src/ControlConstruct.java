import java.util.Scanner;

public class ControlConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number :");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest");
		Check(marks);
	}
        public static void Check(int marks)
        {
        	if (marks>=80)
        	{
        		System.out.println("Welcome to Tech club");
        	}
        }
        
}

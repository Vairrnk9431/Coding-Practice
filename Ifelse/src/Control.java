import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age= s.nextInt();
		vote(age);
	}
	public static void vote(int age) {
		if(age>=21) {
			System.out.println("Eligble to vote");
		    }
		    else {
				System.out.println("Not Eligble to vote");
			}
		
	}

}

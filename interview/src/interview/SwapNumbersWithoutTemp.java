package interview;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		   int num1 = 5, num2 = 10;
	        System.out.println("Before swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);

	        // Swap numbers without using a third variable
	        num1 = num1 + num2;
	        num2 = num1 - num2;
	        num1 = num1 - num2;

	        System.out.println("After swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);
	}

}

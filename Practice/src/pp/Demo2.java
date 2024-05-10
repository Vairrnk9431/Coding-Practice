package pp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] userArray = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Output: " + sumOfUniqueNumbers(userArray));
    }

    private static int sumOfUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : array) {
            uniqueNumbers.add(number);
        }

        int sum = 0;
        for (int uniqueNumber : uniqueNumbers) {
            sum += uniqueNumber;
        }

        return sum;
    }
}
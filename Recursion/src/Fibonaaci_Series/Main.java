package Fibonaaci_Series;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the nth Fibonacci number
         static int fibonacci(int n) {
        // Base cases: fib(0) = 0, fib(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive case: fib(n) = fib(n-1) + fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


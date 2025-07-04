public class FibonaciSeriers {

    public static void main(String[] args) {
        int count = 10;

        System.out.println("Fibonacci Series using Iteration:");
        printFibonacciIterative(count);

        System.out.println("\nFibonacci Series using Recursion:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    // Iterative Approach
    public static void printFibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    // Recursive Approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

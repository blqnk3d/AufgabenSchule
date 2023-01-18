package Aufgabe2;

public class FibonaccizahlRek {
    public static int befor = 0;

    public static void main(String[] args) {
        System.out.println(fibonaccizahl(5));
    }

    /**
     * If n is less than or equal to 0, return 0. If n is equal to 1, return 1. Otherwise, return the sum of the previous
     * two numbers in the sequence
     *
     * @param n The number of the Fibonacci number to be calculated.
     * @return The nth fibonacci number.
     */
    public static int fibonaccizahl(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonaccizahl(n - 1) + fibonaccizahl(n - 2);
        }

    }
}

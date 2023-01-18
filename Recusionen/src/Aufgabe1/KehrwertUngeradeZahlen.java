package Aufgabe1;

public class KehrwertUngeradeZahlen {
    private static boolean isPlus = true;


    public static void main(String[] args) {
        System.out.println(summKehrwert(1000));
        System.out.println(SummKehrwertRec(6));
    }

    /**
     * It calculates the sum of the reciprocals of the odd numbers from 1 to n
     *
     * @param n the number of terms to be summed
     * @return The sum of the reciprocals of the odd numbers from 1 to n.
     */
    public static double summKehrwert(int n) {
        double calk = 0;
        boolean isPlus = true;
        double count = 0;
        while (count < n) {
            if (count % 2 == 1) {
                if (isPlus) {
                    calk += (1 / count);
                    isPlus = false;
                } else {
                    calk -= (1 / count);
                    isPlus = true;
                }
            }

            count++;
        }
        return calk;
    }

    /**
     * If n is even, then the function returns the result of the function with n-1. If n is odd, then the function returns
     * the result of the function with n-1 plus or minus 1/n
     *
     * @param n The number of terms to be summed.
     * @return The sum of the reciprocals of the odd numbers from 1 to n.
     */
    public static double SummKehrwertRec(double n) {
        if (n <= 0) {
            return 0;
        } else if (n % 2 == 1) {
            if (isPlus) {
                isPlus = false;
                return SummKehrwertRec(n - 1) + 1 / n;

            } else {
                isPlus = true;
                return SummKehrwertRec(n - 1) - 1 / n;
            }
        } else {
            return SummKehrwertRec(n - 1);
        }
    }
}

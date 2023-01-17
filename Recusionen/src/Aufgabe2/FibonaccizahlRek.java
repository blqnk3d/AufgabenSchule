package Aufgabe2;

public class FibonaccizahlRek {
    public static int befor = 0;

    public static void main(String[] args) {
        System.out.println(Fibonaccizahl(5));
    }

    public static int Fibonaccizahl(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonaccizahl(n - 1) + Fibonaccizahl(n - 2);
        }

    }
}

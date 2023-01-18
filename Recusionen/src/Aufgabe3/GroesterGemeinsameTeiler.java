package Aufgabe3;

public class GroesterGemeinsameTeiler {
    public static void main(String[] args) {
        System.out.println(ggT(21,56));
    }

    /**
     * If the smaller number is 0, the larger number is the gcd. Otherwise, the gcd is the gcd of the remainder of the
     * larger number divided by the smaller number and the smaller number
     *
     * @param a The first number
     * @param b the smaller number
     * @return The greatest common divisor of a and b.
     */
    public static int ggT(int a, int b) {
        if (a < b) {
            return ggT(b, a);
        }

        if (0 == b) {
            return a;
        }
        return ggT(a % b, b);
    }
}



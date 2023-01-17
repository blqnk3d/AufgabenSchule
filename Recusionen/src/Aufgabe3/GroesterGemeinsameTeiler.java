package Aufgabe3;

public class GroesterGemeinsameTeiler {
    public static void main(String[] args) {
        System.out.println(ggT(21,56));
    }

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



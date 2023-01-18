package Aufgabe4;

public class PascalscheDreieck {
    public static void main(String[] args) {
        printPyra(6);
    }
    /**
     * The number of ways to choose k items from n items is the sum of the number of ways to choose k-1 items from n-1
     * items and the number of ways to choose k items from n-1 items.
     *
     * @param n the number of items in the set
     * @param k the number of successes
     * @return The number of ways to choose k elements from a set of n elements.
     */
    public static long binomial(int n, int k){
        if (k == 0) return 1;
        else if (k > n) return 0;
        else return binomial(n-1, k-1) + binomial(n-1, k);
    }
    /**
     * It prints a pascal triangle with the binomial coefficients of the first n rows
     *
     * @param n the number of rows
     */
    public static void printPyra(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {
                long erg = binomial(i,j);
                if(erg > 0 ){
                    System.out.print(binomial(i,j)+"|");
                }
            }
            System.out.println();
        }
    }
}

package Aufgabe4;

public class PascalscheDreieck {
    public static void main(String[] args) {
        printPyra(6);
    }
    public static long binomial(int n, int k){
        if (k == 0) return 1;
        else if (k > n) return 0;
        else return binomial(n-1, k-1) + binomial(n-1, k);
    }
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

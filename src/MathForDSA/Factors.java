package MathForDSA;

public class Factors {
    public static void findFactors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) System.out.print((n / i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        findFactors(28); // Output: 1 28 2 14 4 7
    }
}

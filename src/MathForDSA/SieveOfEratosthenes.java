package MathForDSA;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }//

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        sieve(50); // Output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    }
}

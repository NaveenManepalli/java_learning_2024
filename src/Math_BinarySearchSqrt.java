public class Math_BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    // Time: O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;
// Binary Search is Used here
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }
            //The condition is only focussing on lesser sqr root of the given number
        }

        // condition to add and chk the decimal value
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            // same chks with the lesser sqr root of the given number
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}

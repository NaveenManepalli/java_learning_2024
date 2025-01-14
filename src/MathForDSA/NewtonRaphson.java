package MathForDSA;

public class NewtonRaphson {
    public static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 1e-6) break;
            x = root;
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(25)); // Output: 5.0
    }
}

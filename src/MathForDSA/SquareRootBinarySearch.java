package MathForDSA;

public class SquareRootBinarySearch {
    public static int squareRoot(int n) {
        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) return mid;
            if (mid * mid < n) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(25)); // Output: 5
        System.out.println(squareRoot(27)); // Output: 5
    }
}

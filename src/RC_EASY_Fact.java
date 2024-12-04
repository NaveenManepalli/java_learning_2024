public class RC_EASY_Fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }


        int sum = n * fact(n-1);
        System.out.println(sum);
        return sum;
    }
}
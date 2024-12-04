public class RC_EASY_DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int remi = (n % 10);
        int quo = sum(n / 10);
        return  remi +quo ;
    }
}

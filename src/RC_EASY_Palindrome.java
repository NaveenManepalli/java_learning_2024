public class RC_EASY_Palindrome {

    static int sum = 0;
    static int rev1(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        System.out.println(sum);
        rev1(n/10);
        System.out.println(sum);

        return sum;
    }



    static boolean palin(int n) {
        return n == rev1(n);
    }

    public static void main(String[] args) {
        System.out.println(palin(121));
    }


}

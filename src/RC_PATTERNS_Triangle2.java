public class RC_PATTERNS_Triangle2{
    public static void main(String[] args) {
        triangle2(4, 0);
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle2(r, c+1);

        } else {
            System.out.println();
            triangle2(r-1, 0);

        }
    }
}
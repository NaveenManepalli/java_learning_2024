public class SwapNumbers {
    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap(3, 7);
    }
}

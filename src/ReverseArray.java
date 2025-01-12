import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverse(arr);
        System.out.println(Arrays.toString(arr)); // Output: [3, 2, 1]
    }
}

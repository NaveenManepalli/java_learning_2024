import java.util.Arrays;

public class SwapValues {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr)); // Output: [3, 2, 1]
    }
}

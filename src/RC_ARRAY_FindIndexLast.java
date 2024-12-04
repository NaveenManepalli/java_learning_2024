public class RC_ARRAY_FindIndexLast {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};

        System.out.println(findIndexLast(arr, 5, arr.length-1));
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }


}

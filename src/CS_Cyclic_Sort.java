import java.util.Arrays;

public class CS_Cyclic_Sort {
    public static void main(String[] args) {

        int[]arr ={3,5,2,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
// cyclic sort need to be used where ever we find the question is given like `1 to n cyclic sort is the main approach
    //Main approach for CYCLIC SORT
    static void sort(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    //Main approach for CYCLIC SORT

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct]=temp;
    }
}

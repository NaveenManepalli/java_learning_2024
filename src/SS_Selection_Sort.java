import java.util.Arrays;

public class SS_Selection_Sort {


    public static void main(String[] args) {

        int[] arr ={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[]arr){
        for (int i=0; i<arr.length;i++){
            //find the  max item in the remaining array and swap current index

            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i=start; i<= end; i++){
            if(arr[i]> arr[max]){
                max =i;
            }
        }
        return max;
    }



}

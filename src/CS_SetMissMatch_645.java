
import java.util.Arrays;


public class CS_SetMissMatch_645 {

    public static void main(String[] args) {
        int[]arr ={1,2,4,5,4};
        System.out.println(Arrays.toString(AllDupArr(arr)));
    }

    static int[] AllDupArr(int[] arr){
        int i =0;
        while (i<arr.length-1){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }


        for (int intex = 0; intex < arr.length; intex++) {
            if (arr[intex] != intex + 1) {
                return new int[]{arr[intex],intex+1};
            }
        }


        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}

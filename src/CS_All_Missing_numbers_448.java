//(AMAZON, GOOGLE)448. all disappeared numbers in a array

import java.util.ArrayList;
import java.util.List;

public class CS_All_Missing_numbers_448 {

    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        System.out.println(AllMissingNumber(arr));

    }

    static List<Integer> AllMissingNumber(int[] arr){
        int i =0;
        while (i<arr.length-1){
            int correct = arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        //condition to search all missing number main part of the program
        List<Integer> ans = new ArrayList<>();
        for (int intex =0;intex<arr.length;intex++){
            if(arr[intex] != intex+1){
                ans.add(intex+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }


}

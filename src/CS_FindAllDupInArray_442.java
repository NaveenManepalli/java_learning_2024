import java.util.ArrayList;
import java.util.List;

public class CS_FindAllDupInArray_442 {

    public static void main(String[] args) {
        int[]arr ={4,3,2,7,8,2,3,1};
        System.out.println(AllDupArr(arr));
    }

    static List<Integer> AllDupArr(int[] arr){
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
                ans.add(arr[intex]);
                ans.add(intex);
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

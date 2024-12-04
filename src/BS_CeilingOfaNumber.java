// ceiling of the number(n) is a number which is greater or equal to a number which is close value to the n ( Cn >= n)
import java.util.*;
public class BS_CeilingOfaNumber {

    public static void main(String[] args) {

        int [] arr ={2,3,4,6,9,10,13,14,16};
        int tar = 12;

        int out = ceiling(arr,tar);

        System.out.println(arr[out]);

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;

            if(target<arr[mid]){
                end =mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return start;
    }

}

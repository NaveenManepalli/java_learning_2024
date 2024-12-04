import java.util.Arrays;

public class BS_PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,10,90,100,120,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[]arr, int target){
        //first Find the range
        //Start with the box of size 2
        int start = 0;
        int end =1;
        //Condition for the target to lie in range what...?
        while(target>arr[end]){
            int newStart = end+1;
            //double the box value
            //end = previous end +size of box*2
            end = end +(end -start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start,int end){


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
        return -1;
    }
}

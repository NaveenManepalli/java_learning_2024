// Binary Search using recursion

public class RC_BinarySearch {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,55,66,78};
        int target = 66;
        System.out.println(Bsearch(arr,target,0,arr.length-1));

    }

    static int Bsearch(int[]arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
         int middle = start +(end-start)/2;

        if(arr[middle]==target){
            return middle;
        }
        if( target<arr[middle]){
            return Bsearch(arr, target, start, middle-1);
        }
        return Bsearch(arr, target, middle+1, end);
    }
}

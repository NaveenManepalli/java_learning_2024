public class BS_OrderAgnostic {
    public static void main(String[]args){

        int [] arr ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int tar = 6;

        System.out.println(orderAgnosticBS(arr,tar));

    }
    static int orderAgnosticBS(int[]arr,int target){

        int start =0;
        int end = arr.length-1;

        boolean isAsc =arr[start] < arr[end];

        while (start<=end){
            int mid =start+(end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                }else {
                    start =mid+1;
                }
            }else {

                if(target>arr[mid]){
                    end =mid-1;
                }else {
                    start =mid+1;
                }
            }
        }

        return -1;

    }
}

public class BS_FindInMountainArray_1095 {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int peak= mountain(arr);
        int firsttry =orderAgnosticBS(arr,target,0 ,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        //try to search in 2nd half
        return orderAgnosticBS(arr,target ,peak+1,arr.length-1);

    }

    static  int mountain(int[]arr){
        int start = 0;
        int end =arr.length-1;
        int ans =0;

        while(start<end){
            int mid = start +(end -start)/2;
            if(arr[mid]> arr[mid+1]){
                // yor are in decreasing part of array
                //this may be the answer but look at left
                // so this is y end is not != mid -1
                end = mid;
            }else{
                //you r in ascending part of the array
                start = mid +1;//because we know that mid +1 element > mid element
            }
            ans =arr[start];
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always  trying to find max  element in above 2 checks
        //hence, when they are pointing to just one element, that is the max one becoz that is what the chk say
        //more elaboration : at every point of start and end, they have the best possible answer till that time
        //and if we are saying that  only one  item is remaining , hence coz of the above line that is the best possible answer

        return ans;
    }
    static int orderAgnosticBS(int[]arr,int target, int start , int end ){

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

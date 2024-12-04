public class BS_RotationCountOfSortedArray {
    public static void main(String[] args) {

        int[]arr={0,1,2,4,5,6,7,8};
        System.out.println(Countrotation(arr));
    }
    static int Countrotation(int[]arr){
        int pivot =findPivot(arr);
//        if (pivot ==-1){
//            return 0;
//        }
        return pivot+1;
    }
    static int findPivot(int[]arr){
        int start =0;
        int end =arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            //4case over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }//if(arr[mid]<=arr[end]){start=mid+1}

        }
        return -1;
    }

    static int findPivotdup(int[]arr){
        int start =0;
        int end =arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            //4case over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }//if element in mid ,start,end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start-1]){
                    return start;
                }
                start++;
                if(arr[end]>arr[end-1]){
                    return end;
                }
                end--;
            }
            //left side is sorted, so pivot should  be right
            else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}

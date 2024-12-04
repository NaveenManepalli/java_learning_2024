public class BS_SearchInRotatedSortArray_33 {
// Rotated binary Search
    public static void main(String[] args) {

        int[]arr ={4,5,6,7,0,1,2};
        System.out.println(findPivotdup(arr));
    }

    static int search(int[]arr, int target){
        int pivot = findPivot(arr);
        // if you did not find pivot, it means the array is not rotated
        if (pivot==-1){
            return binarySearch(arr, target,0,arr.length-1);
        }
        // if piviot is found , you have found 2 asc sorted arrays
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start,int end){
//        int start = 0;
//        int end = arr.length-1;

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

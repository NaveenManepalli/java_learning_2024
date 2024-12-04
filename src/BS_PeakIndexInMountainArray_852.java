//medium question (q no 162 ) easy question(q no 852)
public class BS_PeakIndexInMountainArray_852 {

    public static void main(String[] args) {

        int []arr ={0,10,5,2};
        System.out.println(mountain(arr));
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
}

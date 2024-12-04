public class BS_SplitArrayLargestSum_410 {
    public static void main(String[] args) {

        int[] nums ={7,2,5,10,8};
        int Sa = 2;
        System.out.println(splitArray(nums,Sa));

    }
    static int splitArray(int[]arr, int m){
        int start =0;
        int end = 0;
        for(int i=0; i<arr.length;i++){
            start=Math.max(start,arr[i]);//in the end of the loop it will contain the max item form the array
            end+=arr[i];
        }

        //binary search
        while (start<end){

            //try for the middle has the potential answer
            int mid = start+(end-start)/2;

            // Calculate how pieces you can  divide this in with this max sum
            int sum =0;
            int pieces =1;
            for(int num: arr){
                if(sum+num > mid){
                    // if you cannot this in sub array , make new one
                    //to say you add this num in new sub array , then sum =num
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if(pieces > m){
                start =mid+1;
            }else {
                end =mid;
            }

        }
        return end;// here start == end
    }
}

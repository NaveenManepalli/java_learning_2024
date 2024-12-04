// 34. find first and last position of element in a sorted array*****(Facebook)****

import java.util.Arrays;

public class BS_FirstAndLastPositionSA_34 {
    public static void main(String[] args) {

        int [] arr ={2,2,4,5,6,6,6,6,7,7,8,8,9};
        int tar = 6;

        System.out.println(Arrays.toString(SearchRange(arr, tar)));

    }
    static int[] SearchRange(int[]nums,int target){
        int[] ans ={-1,-1};
//        int start = search(nums,target,true);
//        int end =search(nums,target,false);
//        ans[0]=start;
//        ans[1]=end;


        ans[0] = search(nums,target,true);
        if(ans[0]!= -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;

    }

    // This function will retrun the index value of what we are trying to search (TARGET)
    static int search(int[]nums, int Target, boolean findStartIndex){
        int ans =-1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;

            if(Target<nums[mid]){
                end =mid-1;
            } else if (Target>nums[mid]) {
                start = mid+1;

            }else {
                //Potential answer is found
                ans = mid;
                if(findStartIndex){
                    end =mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
        return ans;
    }
}

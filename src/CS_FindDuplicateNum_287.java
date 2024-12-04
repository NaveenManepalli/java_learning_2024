//(AMAZON,MICROSOFT) 287.Find The Duplicate Number

public class CS_FindDuplicateNum_287 {

    public static void main(String[] args) {
        int[] arr ={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }


    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}

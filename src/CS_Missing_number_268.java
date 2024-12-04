// Amazon interview question "268. MISSING NUMBER IN A FIXED ARRAY"

public class CS_Missing_number_268 {

    public static void main(String[] args) {
        int[] arr ={4,0,2,1};
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i];
            if(arr[i]< arr.length &&arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        //condition to search for missing number main part of the program
        for(int index=0;index< arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int i, int correct) {

        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }


}

public class BO_NoOfDigitsInBinaryBase {


    public static void main(String[] args) {
        int n = 7;
        int ans =0;

        while (n>0){
            // WHEN WE ARE USING THE number which has the binary number (1) in the initial value simply to say odd value
            // (n & 1) works as if both has 1,1 then it is correct and stores the declaring value as 1 if it is true and 0 if it is false
            int last = n & 1;
            //for the function required value are saved and the left shift operator starts to work
            n = n >> 1;
            ans += 1;

        }
        System.out.println(ans);
    }
}
// 001,010,011,100,101,110,111

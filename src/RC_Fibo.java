public class RC_Fibo {

    public static void main(String[] args) {
        int ans =fibo(4);
        System.out.println(ans);
    }
    static int fibo(int num){

        // base condition
        //Linear search recurrence
        // Divide and conquer recurrence (used with binary search)
        if(num<2){
            return num;
        }
        return (fibo(num-1)+fibo(num-2));
    }
}

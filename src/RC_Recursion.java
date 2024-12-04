public class RC_Recursion {
    public static void main(String[] args) {

        print1(1);
    }

    static void print1(int num){
        if(num ==5){
            System.out.println(5);
            return;
        }

        System.out.println(num );

        //this is called tail recursion
        //this the last function call
        print1(num+1);
    }
}

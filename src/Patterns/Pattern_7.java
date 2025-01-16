package Patterns;
//dic inc pyramid
public class Pattern_7 {
    public static void main(String[] args) {

        pattern7(5);
    }
    static void pattern7(int num){
        for(int row=1;row<=num;row++){



            int exspa = num-row;
            for(int s=1;s<=exspa;s++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

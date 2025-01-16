package Patterns;
//nXn square
public class Pattern_2 {
    public static void main(String[] args) {

        pattern2(4);

    }
    static void pattern2(int num){
        for (int row =1; row<=num;row++){
            //for every row, run the col
            for(int col=1;col<=num;col++){
                System.out.print("* ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}

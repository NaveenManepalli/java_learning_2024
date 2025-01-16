package Patterns;
//HalfDiamond
public class Pattern_05 {

    public static void main(String[] args) {
        pattern1(4);

    }
    static void pattern1(int num){
        for(int row =1; row<= 2*num; row++){
            //for every row, run the col
            int totcol = row > num ? 2* num-row:row;
            for(int col =1; col<=totcol;col++){
                System.out.print("* ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}
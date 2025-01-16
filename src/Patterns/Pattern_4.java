package Patterns;
//simple triangle with number incriment
public class Pattern_4 {

    public static void main(String[] args) {
        pattern4(4);

    }
    static void pattern4(int num){
        for(int row =1; row<= num; row++){
            //for every row, run the col
            for(int col =1; col<=row;col++){
                System.out.print(col +" ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}


public class Pattern_1 {

    public static void main(String[] args) {
        pattern1(4);

    }
    static void pattern1(int num){
        for(int row =1; row<= num; row++){
            //for every row, run the col
            for(int col =1; col<=row;col++){
                System.out.print("* ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}

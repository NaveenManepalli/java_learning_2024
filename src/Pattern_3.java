public class Pattern_3 {
    public static void main(String[] args) {

        pattern3(5);
    }
    static void pattern3(int num){
        for(int row =1;row<=num;row++){
            //for every row, run the col
            for(int col=1;col<=num-row+1;col++){
                System.out.print("* ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}

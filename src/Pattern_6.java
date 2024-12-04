public class Pattern_6 {

    public static void main(String[] args) {
        pattern6(4);

    }
    static void pattern6(int num){
        for(int row =1; row<= 2*num; row++){
            //for every row, run the col
            int totcol = row > num ? 2* num-row:row;
            int noSpa = num-totcol;

            for (int s=0;s<noSpa;s++){
                System.out.print(" ");
            }

            for(int col =1; col<=totcol;col++){
                System.out.print("* ");
            }
            //when one row is printed completely need to create a new line
            System.out.println();
        }
    }
}
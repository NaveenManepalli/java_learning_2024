public class Pattern_8 {
    public static void main(String[] args) {

        pattern8(5);
    }
    static void pattern8(int num){
        for(int row=1;row<=2*num;row++){


            int totcol = row > num ? 2* num-row:row;
            int exspa = num-totcol;
            for(int s=1;s<=exspa;s++){
                System.out.print("  ");
            }
            for(int col=totcol;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=totcol;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

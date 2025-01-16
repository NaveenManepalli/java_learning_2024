package Patterns;
//numbers decrease as you move toward the edges and increase toward the center(minimum distance from the edges.)
public class Pattern_09 {

    public static void main(String[] args) {
        Pattern9(4);
    }

    static void Pattern9(int num){
        int originaln =num+1;
        num =2*num;
        for (int row =1;row<num;row++){
            for(int col=1;col<num;col++){
                int atEveryIndex = originaln -Math.min(Math.min(row,col),Math.min(num-row,num-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}

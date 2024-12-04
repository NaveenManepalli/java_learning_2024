//GOOGLE question (832.Flipping an image)

import java.util.Arrays;

public class BO_FlippingAnImage_832 {

    public static void main(String[] args) {

        int[][] num ={{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(Arrays.deepToString(num));

    }

    private static int[][] flipandinvertimage(int[][] image){

        for (int[] row :image){
            // reverse this array
            for(int i =0; i<(image[0].length+1)/2;i++){
                // swap
                int temp =row[i] ^ 1;
                row[i] =row[image[0].length-i-1] ^1;
                row[image[0].length-i-1] =temp;
            }
        }return image;
    }
}

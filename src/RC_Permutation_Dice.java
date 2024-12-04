//Amazom interview question
public class RC_Permutation_Dice {

    public static void main(String[] args) {

        dice("",3);
    }

    static  void  dice (String p, int tar){
        if (tar == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=6 && i <= tar; i++){
            dice(p+i, tar-i);
        }
    }
}

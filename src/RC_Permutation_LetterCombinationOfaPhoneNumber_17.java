import java.util.ArrayList;

//Importnt google program (17. Letter Combination Of A Phone Number)
public class RC_Permutation_LetterCombinationOfaPhoneNumber_17 {

    public static void main(String[] args) {

        System.out.println(pad("","132"));
    }

    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>List =new ArrayList<>();
            List.add(p);
            return List;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) -'0'; // this will convert '2' in to 2

        for(int i =(digit-1)*3; i<digit*3; i++){

            char ch = (char) ('a'+i);
            ans.addAll(pad(p+ch,up.substring(1)));
        }
        return ans;
    }
}

import java.util.ArrayList;

public class RC_SUBSEQUENCE_RET_arraylist_1 {

    public static void main(String[] args) {

        System.out.println(subseqRET("","abc"));

    }
    static ArrayList<String> subseqRET(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch  = up.charAt(0);

        ArrayList<String> left = subseqRET(p+ch, up.substring(1));
        ArrayList<String> right = subseqRET(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}

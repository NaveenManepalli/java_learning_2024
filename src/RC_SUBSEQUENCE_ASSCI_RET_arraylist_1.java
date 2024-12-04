import java.util.ArrayList;

public class RC_SUBSEQUENCE_ASSCI_RET_arraylist_1 {

    public static void main(String[] args) {

        System.out.println(subseqAssciRET("","abc"));

    }
    static ArrayList<String> subseqAssciRET(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch  = up.charAt(0);

        ArrayList<String> first = subseqAssciRET(p+ch, up.substring(1));
        ArrayList<String> second = subseqAssciRET(p, up.substring(1));
        ArrayList<String> third = subseqAssciRET(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}

import java.util.ArrayList;

public class RC_Permutation_List {
    public static void main(String[] args) {

        System.out.println(permutation("","abc"));
    }

    static ArrayList<String> permutation(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i =0;i <=p.length();i++){
            String f =p.substring(0,i);
            String e =p.substring(i,p.length());
            ans.addAll (permutation(f+ch+e,up.substring(1)));
        }

        return ans;
    }
}

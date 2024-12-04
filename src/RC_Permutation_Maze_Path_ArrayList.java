import java.util.ArrayList;
import java.util.List;

public class RC_Permutation_Maze_Path_ArrayList {

    public static void main(String[] args) {

        System.out.println(Path("",3,3));

    }

    static ArrayList<String> Path(String p, int r, int c){
        if (r==1&&c==1){
            ArrayList<String>  list = new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        System.out.println(p);
        if (r>1){
            list.addAll(Path(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(Path(p+'R',r,c-1));
        }

        System.out.println(list);
        return list;
    }
}

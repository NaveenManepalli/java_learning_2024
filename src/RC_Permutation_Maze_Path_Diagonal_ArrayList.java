import java.util.ArrayList;
import java.util.List;

public class RC_Permutation_Maze_Path_Diagonal_ArrayList {

    public static void main(String[] args) {

        System.out.println(Path("",3,3));

    }

    static ArrayList<String> Path(String p, int r, int c){
        if (r==1&&c==1){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r>1&&c>1){
            list.addAll(Path(p+'D',r-1,c-1));
        }

        if (r>1){
            list.addAll(Path(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(Path(p+'R',r,c-1));
        }


        return list;
    }
}

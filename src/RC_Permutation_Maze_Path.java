public class RC_Permutation_Maze_Path {

    public static void main(String[] args) {

        Path("",3,3);

    }

    static void Path(String p,int r, int c){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            Path(p+'D',r-1,c);
        }
        if (c>1){
            Path(p+'R',r,c-1);
        }
    }
}

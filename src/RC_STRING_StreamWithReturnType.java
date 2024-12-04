public class RC_STRING_StreamWithReturnType {
    public static void main(String[] args) {
        System.out.println(skip("abcdahanajdn"));
    }
    static String skip(String p){
        if (p.isEmpty()){
            return " ";
        }
        char ch = p.charAt(0);
        if (ch == 'a'){
            return skip(p.substring(1));
        }else {

            return ch+ skip(p.substring(1));
        }
    }
}

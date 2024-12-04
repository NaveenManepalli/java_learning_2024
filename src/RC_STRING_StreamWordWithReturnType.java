public class RC_STRING_StreamWordWithReturnType {

    public static void main(String[] args) {

        System.out.println(skipWord("abcdapplehanajdn"));

    }

    static String skipWord(String p){

        if (p.isEmpty()){
            return " ";
        }

        char ch = p.charAt(0);

        if (p.startsWith("apple")){
            return skipWord(p.substring(5));
        }else {
            return ch+ skipWord(p.substring(1));
        }
    }
}

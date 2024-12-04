public class RC_STRING_StreamWordWithReturnType2 {

    public static void main(String[] args) {
        System.out.println(skipWord("abcdappleapphanajdn"));
    }

    static String skipWord(String p){
        if (p.isEmpty()){
            return " ";
        }
        char ch = p.charAt(0);
        if (p.startsWith("app") && !p.startsWith("apple")){
            return skipWord(p.substring(3));
        }else {
            return ch+ skipWord(p.substring(1));
        }
    }
}

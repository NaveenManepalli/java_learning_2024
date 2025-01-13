package LinearSearch;

public class SearchInString {
    public static boolean searchChar(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        char target = 'W';
        boolean result = searchChar(str, target);
        System.out.println("Character found: " + result);
    }
}

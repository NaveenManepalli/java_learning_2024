public class AlphabetCaseCheck {
    public static void main(String[] args) {
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter.");
        } else {
            System.out.println("Not an alphabet.");
        }
    }
}

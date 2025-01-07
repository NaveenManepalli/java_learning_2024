public class CountOccurrences {
    public static void main(String[] args) {
        int number = 12345234, digit = 2, count = 0;
        while (number > 0) {
            int rem = number % 10;
            if (rem == digit) {
                count++;
            }
            number /= 10;
        }
        System.out.println("Digit " + digit + " occurs " + count + " times.");
    }
}

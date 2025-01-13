package LinearSearch;

public class EvenDigitsOptimized {
    public static int countDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    public static int countEvenDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Count of numbers with even digits: " + countEvenDigits(nums));
    }
}

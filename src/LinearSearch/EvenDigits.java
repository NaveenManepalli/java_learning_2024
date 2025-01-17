package LinearSearch;

public class EvenDigits {
    public static int countEvenDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 21, 6, 7892};
        System.out.println("Count of numbers with even digits: " + countEvenDigits(nums));
    }//revised
}

import java.util.HashMap;

public class SubString_Interview {
    public static int cf(String A, String B) {
        HashMap<Character, Integer> freqA = new HashMap<>();
        HashMap<Character, Integer> freqB = new HashMap<>();

        // Count frequency of each character in A
        for (char c : A.toCharArray()) {
            freqA.put(c, freqA.getOrDefault(c, 0) + 1);
        }

        // Count frequency of each character in B
        for (char c : B.toCharArray()) {
            freqB.put(c, freqB.getOrDefault(c, 0) + 1);
        }

        // Calculate the maximum number of times A can be formed using B
        int minCount = Integer.MAX_VALUE;
        for (char c : freqA.keySet()) {
            if (!freqB.containsKey(c)) {
                return 0; // If B does not have a required character from A
            }
            minCount = Math.min(minCount, freqB.get(c) / freqA.get(c));
        }

        return minCount;
    }

    public static void main(String[] args) {
        String A = "aa";
        String B = "aaba";
        System.out.println(cf(A, B)); // Output: 1
    }
}
package LinearSearch;

public class MaxWealth {
    public static int findMaxWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] person : accounts) {
            int sum = 0;
            for (int wealth : person) {
                sum += wealth;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        System.out.println("Maximum wealth is: " + findMaxWealth(accounts));
    }
}

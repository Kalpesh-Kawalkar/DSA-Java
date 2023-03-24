package LinearSearchEx;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int person=0; person<accounts.length; person++) {
            for(int account=0; account<accounts[account].length; account++) {
                int sum += accounts[person][account];
                if(sum > maxSum) {
                    sum = maxSum;
                }
            }
        }
        return maxSum;
    }
}
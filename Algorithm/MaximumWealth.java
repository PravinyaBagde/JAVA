
//A question from leetcode (1672)
 public class MaximumWealth {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},
                          {3,2,1}};
        int ans = maximumWaelth(array);
        System.out.println(ans);

    }
    public static int maximumWaelth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }}

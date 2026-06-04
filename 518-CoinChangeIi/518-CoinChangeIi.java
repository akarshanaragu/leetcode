// Last updated: 6/4/2026, 10:32:21 AM
class Solution {
    public int change(int amount, int[] coins) {
        int n = amount+1;
        int[] dp = new int[n];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int c : coins){
            for(int i=c;i<n;i++){
                dp[i]=dp[i-c]+dp[i];
            }
        }
        return dp[amount];
    }
}
// Last updated: 6/4/2026, 10:32:23 AM
class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length()<=1) return s.length();
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
        }
        for(int len=2;len<=s.length();len++){
            for(int i=0;i<=s.length()-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(len==2) dp[i][j]=2;
                    else dp[i][j]=2+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
// Last updated: 19/7/2026, 11:24:18 pm
1class Solution {
2    public int equalSubstring(String s, String t, int max) {
3        int l=0,sum=0,m=0;
4        for(int r=0;r<s.length();r++){
5            int abs = Math.abs(s.charAt(r)-t.charAt(r));
6            sum+=abs;
7            if(sum>max){
8                sum-=Math.abs(s.charAt(l)-t.charAt(l));
9                l++;
10            }
11            m = Math.max(m,r-l+1);
12        }
13        return m;
14
15    }
16}
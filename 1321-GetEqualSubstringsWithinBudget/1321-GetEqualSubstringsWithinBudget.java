// Last updated: 20/7/2026, 9:23:51 am
class Solution {
    public int equalSubstring(String s, String t, int max) {
        int l=0,sum=0,m=0;
        for(int r=0;r<s.length();r++){
            int abs = Math.abs(s.charAt(r)-t.charAt(r));
            sum+=abs;
            if(sum>max){
                sum-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            m = Math.max(m,r-l+1);
        }
        return m;

    }
}
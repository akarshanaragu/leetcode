// Last updated: 6/4/2026, 10:32:33 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
     int m=s.length,n=g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while(l<m&&r<n)
        {
            if(s[l]>=g[r])
               r++;
            l++;
        }
        return r;   
    }
}
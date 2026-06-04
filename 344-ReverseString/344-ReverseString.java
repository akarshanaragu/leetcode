// Last updated: 6/4/2026, 10:32:53 AM
class Solution {
    public void reverseString(char[] s) {
        int l = 0,r = s.length-1;
        while(l<r){
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;r--;
        }
    }
}
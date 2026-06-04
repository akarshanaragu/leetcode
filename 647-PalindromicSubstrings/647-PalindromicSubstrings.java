// Last updated: 6/4/2026, 10:32:03 AM
class Solution {
    public int countSubstrings(String s) {
        int res =0;
        for(int i=0;i<s.length();i++){
            res+=palindrome(s,i,i+1);
            res+=palindrome(s,i,i);
        }
        return res;
    }
    public int palindrome(String s,int l,int r){
        int c=0;
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            c++;
            l--;r++;
        }
        return c;
    }
}
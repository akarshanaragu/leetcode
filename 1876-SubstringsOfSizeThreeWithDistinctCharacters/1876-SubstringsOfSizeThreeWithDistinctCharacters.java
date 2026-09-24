// Last updated: 24/9/2026, 3:07:39 pm
class Solution {
    public int countGoodSubstrings(String s) {
        int ct=0;
        for(int i=0;i<s.length()-2;i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a!=b&&a!=c&&b!=c){
                ct++;
            }
        }
        return ct;
    }
}
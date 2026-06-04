// Last updated: 6/4/2026, 10:30:48 AM
class Solution {
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int n = s.length();
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int i=1;i<n-k+1;i++){
            if(isvowel(s.charAt(i-1))){
                count--;
            }
            if(isvowel(s.charAt(i+k-1))){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
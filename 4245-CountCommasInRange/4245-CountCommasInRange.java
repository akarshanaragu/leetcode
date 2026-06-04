// Last updated: 6/4/2026, 10:24:51 AM
class Solution {
    public int countCommas(int n) {
        int a =0;
        for(int i=1;i<=n;i++){
            int d =String.valueOf(i).length();
            if(d>3){
                a+=(d-1)/3;
            }
        }
        return a;
    }
}
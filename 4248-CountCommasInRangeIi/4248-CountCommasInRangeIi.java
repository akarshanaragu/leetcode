// Last updated: 6/4/2026, 10:24:45 AM
class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long count=0;
        long n1=n,start=1000;
        while(start<=n1){
            count+=n1-start+1;
            start*=1000;
        }
        return count;
    }
}
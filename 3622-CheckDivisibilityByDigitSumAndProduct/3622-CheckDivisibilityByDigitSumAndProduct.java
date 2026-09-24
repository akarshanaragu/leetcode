// Last updated: 24/9/2026, 3:05:35 pm
class Solution {
    public boolean checkDivisibility(int num) {
        int p = 1,s=0,n=num;
        while(n>0){
            int t = n%10;
            s+=t;
            p=p*t;
            n=n/10;
        }
        System.out.print(s+" "+p);
        return num%(s+p)==0;
    }
}
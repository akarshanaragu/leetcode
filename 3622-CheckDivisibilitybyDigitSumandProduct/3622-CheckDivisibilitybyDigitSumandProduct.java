// Last updated: 22/8/2026, 11:22:50 am
1class Solution {
2    public boolean checkDivisibility(int num) {
3        int p = 1,s=0,n=num;
4        while(n>0){
5            int t = n%10;
6            s+=t;
7            p=p*t;
8            n=n/10;
9        }
10        System.out.print(s+" "+p);
11        return num%(s+p)==0;
12    }
13}
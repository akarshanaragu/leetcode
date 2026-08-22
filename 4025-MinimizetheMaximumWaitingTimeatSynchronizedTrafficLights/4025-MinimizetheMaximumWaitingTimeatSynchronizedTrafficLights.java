// Last updated: 22/8/2026, 9:42:38 am
1class Solution {
2    public int minPenalty(int p, int[] l, int[] a) {
3        int max = 0,ans =0,w=0;
4        for(int i=0;i<l.length;i++){
5            max = Math.max(max,l[i]);
6        }
7        for(int i=0;i<a.length;i++){
8            int x = a[i]%p;
9            if(x>=max){
10                w=p-x;
11                System.out.println(p-max);
12            }
13            ans = Math.max(w,ans);
14        }
15        return ans;
16    }
17}
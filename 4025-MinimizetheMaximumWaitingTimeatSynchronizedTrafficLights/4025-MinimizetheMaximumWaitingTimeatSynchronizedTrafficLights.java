// Last updated: 22/8/2026, 9:39:14 am
1class Solution {
2    public int minPenalty(int p, int[] l, int[] a) {
3        int max = 0;
4        for(int i=0;i<l.length;i++){
5            max = Math.max(max,l[i]);
6        }
7        System.out.println(max);
8        int ans =-1;
9        for(int i=0;i<a.length;i++){
10            int x = a[i]%p;
11            int w=0;
12            if(x<max){
13                w=0;
14            }
15            else if(x>=max){
16                w=p-x;
17                System.out.println(p-max);
18            }
19            ans = Math.max(w,ans);
20        }
21        return ans;
22    }
23}
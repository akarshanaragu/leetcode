// Last updated: 6/4/2026, 10:26:10 AM
class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        boolean []res=new boolean[n];
        res[0]=true;
        int last=0+minJump;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0' && res[i]){
                int min=i+minJump;
                int max=i+maxJump;
                if(min<n && s.charAt(min)=='0') res[min]=true;
                if(max<n && s.charAt(max)=='0') res[max]=true;
                for(int j=Math.max(min,last);j<max;j++){
                    if(j<n && s.charAt(j)=='0') res[j]=true;
                    last=j;
                }
            }
        }
        return res[n-1];
    }
}









// class Solution {
//     public boolean canReach(String s, int minJump, int maxJump) {

//         int n = s.length();

//         boolean[] b = new boolean[n];
//         b[0]=true;
//         int count=0;

//         for(int i=0; i<n; i++)
//         {
//             if(i-minJump>=0 && b[i-minJump]){
//                 count++;
//             }

//             if(i-maxJump-1>=0 && b[i-maxJump-1]){
//                 count--;
//             }
            
//             if(count>0 && s.charAt(i) == '0'){
//                 b[i] = true;
//             }
//         }
//         return b[n-1];
//     }
// }

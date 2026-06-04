// Last updated: 6/4/2026, 10:25:49 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int w=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                w++;
            }
        }
        
        int min = w;
        for(int i=1;i<n-k+1;i++){
            if(blocks.charAt(i-1)=='W'){
                w--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                w++;
            }
            if(w<min){
                min = w;
            }
        }
        return min;
    }
}
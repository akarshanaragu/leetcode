// Last updated: 6/4/2026, 10:32:50 AM
class Solution {
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });

        int[] lis = new int[envelopes.length];
        int size = 0;

        for(int[] e: envelopes){

            int h = e[1];

            int i = Arrays.binarySearch(lis,0,size,h);

            if(i<0) i = -(i+1);

            lis[i] = h;

            if(i==size) size++;
        }

        return size;
    }
}
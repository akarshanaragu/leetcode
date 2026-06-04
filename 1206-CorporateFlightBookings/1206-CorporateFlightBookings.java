// Last updated: 6/4/2026, 10:31:10 AM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        int start,end,val;
        for(int i=0;i<bookings.length;i++){
            start = bookings[i][0]-1;
            end= bookings[i][1]-1;
            val = bookings[i][2];

            diff[start]+=val;
            if(end+1<n){
                diff[end+1]-=val;
            }
        }
        int prefix[] = new int[n];
        prefix[0] = diff[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+diff[i];
        }
        return prefix;
    }
}
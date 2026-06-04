// Last updated: 6/4/2026, 10:32:28 AM
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Integer> s=new ArrayList<>();
        int n=nums.length;
        int j=0;
        double[] avg=new double[n-k+1];
        for(int i=0; i<n; i++){
            int pos=Collections.binarySearch(s,nums[i]);
            if(pos<0) pos=-pos-1;
            s.add(pos,nums[i]);
            if(s.size()==k){
                if(k%2==1){
                    avg[j++]=s.get(k/2);
                }else{
                    long sum=(long)s.get(k/2-1)+(long)s.get(k/2);
                    avg[j++]=sum/2.0;
                }
                int deletepos=Collections.binarySearch(s,nums[i-k+1]);
                s.remove(deletepos);
            }
        }
        return avg;
    }
}
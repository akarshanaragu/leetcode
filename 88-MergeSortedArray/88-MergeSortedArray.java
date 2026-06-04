// Last updated: 6/4/2026, 10:34:47 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n+m];
        for(int i=0;i<m;i++){
            temp[i] = nums1[i];
        }
        int j=0;
        for(int i=m;i<n+m;i++){
            temp[i] = nums2[j];
            j++;
        }
        Arrays.sort(temp);
        for(int i=0;i<n+m;i++){
            nums1[i] = temp[i];
        }
    }
}
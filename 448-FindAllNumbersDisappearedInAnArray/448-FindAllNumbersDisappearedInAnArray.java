// Last updated: 6/4/2026, 10:32:35 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            int in = arr[i]-1;
            if(arr[i]!=arr[in]){
                int temp=arr[i];
                arr[i]=arr[in];
                arr[in] = temp;
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
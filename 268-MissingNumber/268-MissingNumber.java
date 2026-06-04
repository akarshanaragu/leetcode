// Last updated: 6/4/2026, 10:33:07 AM
class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int index = arr[i];
            if(arr[i]!=arr.length&&arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
}
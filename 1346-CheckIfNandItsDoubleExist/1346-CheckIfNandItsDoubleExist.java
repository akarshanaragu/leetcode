// Last updated: 1/8/2026, 11:41:50 pm
1class Solution {
2
3    public boolean checkIfExist(int[] arr) {
4
5        for (int i = 0; i < arr.length; i++) {
6            for (int j = 0; j < arr.length; j++) {
7                
8                if (i != j && arr[i] == 2 * arr[j]) 
9                    return true;
10                
11
12            }
13        }
14        return false;
15    }
16
17}
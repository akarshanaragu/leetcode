// Last updated: 9/7/2026, 1:51:40 pm
1class Solution {
2    List<List<Integer>> list  = new ArrayList<>();
3    public void generate (int arr[],int i , ArrayList<Integer> l){
4        if(i==arr.length){
5            list.add(new ArrayList<> (l));
6            return;
7        }
8        l.add(arr[i]);
9        generate(arr,i+1,l);
10        l.remove(l.size()-1);
11        generate(arr,i+1,l);
12    }
13    public List<List<Integer>> subsets(int[] nums) {
14        ArrayList<Integer> l = new ArrayList<>();
15        generate(nums,0,l);
16        return list;
17    }
18}
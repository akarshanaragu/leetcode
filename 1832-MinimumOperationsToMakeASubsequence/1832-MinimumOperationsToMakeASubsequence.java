// Last updated: 6/4/2026, 10:30:30 AM
class Solution {
    public int minOperations(int[] target, int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<target.length;i++)
            map.put(target[i], i);

        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(map.containsKey(num))
                list.add(map.get(num));
        }

        List<Integer> lis = new ArrayList<>();

        for(int num : list){

            int idx = Collections.binarySearch(lis, num);

            if(idx < 0)
                idx = -(idx + 1);

            if(idx == lis.size())
                lis.add(num);
            else
                lis.set(idx, num);
        }

        return target.length - lis.size();
    }
}
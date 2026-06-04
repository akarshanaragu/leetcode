// Last updated: 6/4/2026, 10:25:09 AM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean l[] = new boolean[101];

        for(int b: bulbs){
            l[b]=!l[b];
        }

            List<Integer> res = new ArrayList<>();
            for(int i=1;i<=100;i++){
                if(l[i]){
                    res.add(i);
                }
            }
        return res;
    }
}
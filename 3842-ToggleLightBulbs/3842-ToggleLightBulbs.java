// Last updated: 24/9/2026, 3:05:07 pm
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
// Last updated: 6/4/2026, 10:31:51 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h = new HashMap<>();
        int count=0;
        for(char ch : stones.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(char ch : jewels.toCharArray()){
            if(h.containsKey(ch)){
                count=count+h.get(ch);
            }
        }
        return count;
    }
}
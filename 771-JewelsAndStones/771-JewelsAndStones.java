// Last updated: 24/9/2026, 3:10:54 pm
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
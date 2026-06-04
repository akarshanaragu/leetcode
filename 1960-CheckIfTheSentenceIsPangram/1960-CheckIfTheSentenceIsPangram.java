// Last updated: 6/4/2026, 10:26:17 AM
class Solution {
    public boolean checkIfPangram(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            h.put(ch,h.getOrDefault(h,0)+1);
        }
        return h.size()==26;
    }
}
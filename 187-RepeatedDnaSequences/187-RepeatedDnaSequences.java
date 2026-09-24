// Last updated: 24/9/2026, 3:13:41 pm
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
        for(int r=0;r<=s.length()-10;r++){
            String  sub = s.substring(r,r+10);
            if(s1.contains(sub)){
                s2.add(sub);
            }else{
                s1.add(sub);
            }
            
        }
        
        return new ArrayList<>(s2);
    }
}
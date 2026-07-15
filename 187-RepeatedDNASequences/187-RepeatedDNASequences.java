// Last updated: 15/7/2026, 2:12:36 pm
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        HashSet<String> s1 = new HashSet<>();
4        HashSet<String> s2 = new HashSet<>();
5        for(int r=0;r<=s.length()-10;r++){
6            String  sub = s.substring(r,r+10);
7            if(s1.contains(sub)){
8                s2.add(sub);
9            }else{
10                s1.add(sub);
11            }
12            
13        }
14        
15        return new ArrayList<>(s2);
16    }
17}
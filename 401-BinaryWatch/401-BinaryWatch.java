// Last updated: 23/7/2026, 2:20:36 pm
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> res = new ArrayList<>();
4
5        for (int h = 0; h < 12; h++) {
6            for (int min = 0; min < 60; min++) {
7                int bit = Integer.bitCount(h) + Integer.bitCount(min);
8                if (bit == turnedOn) {
9                    res.add(h + ":" + String.format("%02d", min));
10                }
11            }
12        }
13        
14        return res;
15    }
16}
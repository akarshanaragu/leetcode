// Last updated: 29/6/2026, 10:08:05 am
1class Solution {
2    public String intToRoman(int temp) {
3
4        HashMap<Integer, String> map = new HashMap<>();
5
6        map.put(1, "I");
7        map.put(2, "II");
8        map.put(3, "III");
9        map.put(4, "IV");
10        map.put(5, "V");
11        map.put(6, "VI");
12        map.put(7, "VII");
13        map.put(8, "VIII");
14        map.put(9, "IX");
15        map.put(10, "X");
16
17        StringBuilder sb = new StringBuilder();
18
19        while (temp > 0) {
20
21            if (temp <= 10) {
22                sb.append(map.get(temp));
23                break;
24            } 
25            
26            else if (temp >= 1000) {
27                sb.append("M");
28                temp -= 1000;
29            }
30            
31            else if (temp >= 900) {
32                sb.append("CM");
33                temp -= 900;
34            } 
35            
36            else if (temp >= 500) {
37                sb.append("D");
38                temp -= 500;
39            }
40            
41            else if (temp >= 400) {
42                sb.append("CD");
43                temp -= 400;
44            } 
45            
46            else if (temp >= 100) {
47                sb.append("C");
48                temp -= 100;
49            }
50            
51            else if (temp >= 90) {
52                sb.append("XC");
53                temp -= 90;
54            }
55            
56            else if (temp >= 50) {
57                sb.append("L");
58                temp -= 50;
59            } 
60            
61            else if (temp >= 40) {
62                sb.append("XL");
63                temp -= 40;
64            } 
65            
66            else if (temp >= 10) {
67                sb.append("X");
68                temp -= 10;
69            }
70            
71        }
72
73        return sb.toString();
74    }
75}
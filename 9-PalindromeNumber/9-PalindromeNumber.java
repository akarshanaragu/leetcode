// Last updated: 24/7/2026, 9:59:27 pm
1class Solution {
2
3    int rev = 0;
4
5    public boolean isPalindrome(int x) {
6        
7        if (x < 0) 
8            return false;
9
10        int original = x;
11        reverse(x);
12
13        return original == rev;
14    }
15
16    void reverse(int x) {
17
18        if (x == 0) 
19            return;
20
21        rev = rev * 10 + x % 10;
22        reverse(x / 10);
23
24    }
25}
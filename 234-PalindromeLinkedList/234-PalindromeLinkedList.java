// Last updated: 22/7/2026, 9:56:36 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    
13    ListNode curr;
14
15    public boolean isPalindrome(ListNode head) {
16        curr = head;
17        return solve(head);
18    }
19
20    public boolean solve(ListNode head) {
21        if (head == null) {
22            return true;
23        }
24
25        boolean b = solve(head.next) && curr.val == head.val;
26
27        curr = curr.next;
28
29        return b;
30
31    }
32
33}
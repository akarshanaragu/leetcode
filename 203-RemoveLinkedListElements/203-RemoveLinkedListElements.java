// Last updated: 30/7/2026, 9:54:32 pm
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
12    public ListNode removeElements(ListNode head, int val) {
13
14        if (head == null) {
15            return null;
16        }
17
18        head.next = removeElements(head.next, val);
19
20        if (head.val == val) {
21            return head.next;
22        }
23
24        return head;
25        
26    }
27}
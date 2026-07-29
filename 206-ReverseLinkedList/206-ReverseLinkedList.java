// Last updated: 29/7/2026, 11:14:07 pm
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
13    public ListNode reverseList(ListNode head) {
14
15        if (head == null || head.next == null) {
16            return head;
17        }
18
19        ListNode newhead = reverseList(head.next);
20        head.next.next = head;
21        head.next = null;
22
23        return newhead;
24    }
25
26}
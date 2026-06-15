// Last updated: 15/6/2026, 11:42:45 pm
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
12    public ListNode deleteMiddle(ListNode head) {
13        if (head == null || head.next == null) {
14            return null;
15        }
16
17        ListNode temp = null;
18        ListNode slow = head;
19        ListNode fast = head;
20
21        while (fast != null && fast.next != null) {
22            temp = slow;
23            slow = slow.next;
24            fast = fast.next.next;
25        }
26        temp.next = slow.next;
27        return head;
28    }
29}
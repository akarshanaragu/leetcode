// Last updated: 30/7/2026, 10:58:54 pm
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13
14        if (list1 == null) {
15            return list2;
16        }
17
18        if (list2 == null) {
19            return list1;
20        }
21
22        if (list1.val <= list2.val) {
23            list1.next = mergeTwoLists(list1.next, list2);
24            return list1;
25        } 
26
27        else {
28            list2.next = mergeTwoLists(list1, list2.next);
29            return list2;
30        }
31
32    }
33}
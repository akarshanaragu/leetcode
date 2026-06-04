// Last updated: 6/4/2026, 10:35:05 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }

        temp.next = head;

        int move = len - k;
        ListNode curr = head;

        for (int i = 1; i < move; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
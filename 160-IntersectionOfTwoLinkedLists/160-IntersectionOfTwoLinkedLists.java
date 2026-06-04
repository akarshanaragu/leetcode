// Last updated: 6/4/2026, 10:33:59 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode c1 = headA, c2 = headB;

        while (c1 != c2) {
            
            if (c1 == null)
                c1 = headB;

            else if (c2 == null)
                c2 = headA;

            else {
                c1 = c1.next;
                c2 = c2.next;
            }
        }

        return c2;
    }
}
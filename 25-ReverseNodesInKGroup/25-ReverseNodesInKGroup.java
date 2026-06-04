// Last updated: 6/4/2026, 10:35:37 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p = dummy;
        while(true){
            ListNode s=p.next;
            ListNode e =p;
            for(int i=0;i<k;i++){
                e=e.next;
                if(e==null) return dummy.next;
            }
            ListNode ng=e.next;
            ListNode a=ng,b=s,c=b.next;
            while(b!=ng){
                b.next=a;
                a=b;b=c;
                if(c!=null)
                c=c.next;
            }
            p.next=e;
            p=s;
        }
    }
}
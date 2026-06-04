// Last updated: 6/4/2026, 10:31:17 AM
class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int n = list.size();
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && list.get(i) > list.get(st.peek())) {
                int idx = st.pop();
                res[idx] = list.get(i);
            }
            st.push(i);
        }


        return res;
    }
}

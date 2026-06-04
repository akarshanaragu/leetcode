// Last updated: 6/4/2026, 10:34:38 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0; 

        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> l = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                if (level % 2 == 0)
                    l.addLast(node.val);
                else
                    l.addFirst(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            ans.add(l);
            level++;
        }

        return ans;
    }
}

// Last updated: 6/4/2026, 10:34:29 AM
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int a = minDepth(root.left);
        int b = minDepth(root.right);
        if (a == 0)
            return 1 + b;

        if (b == 0)
            return 1 + a;

        return 1 + Math.min(a,b);
    }
}

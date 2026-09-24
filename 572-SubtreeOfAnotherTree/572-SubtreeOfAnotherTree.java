// Last updated: 24/9/2026, 3:11:20 pm
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
    public boolean is(TreeNode r, TreeNode s) {
        if (r == null && s == null) {
            return true;
        }
        if (r == null || s == null) {
            return false;
        }
        return r.val == s.val && is(r.left, s.left) && is(r.right, s.right);
    }

    public boolean isSubtree(TreeNode r, TreeNode s) {
        if (r == null) {
            return false;
        }
        if (is(r, s)) {
            return true;
        }
        return isSubtree(r.left, s) || isSubtree(r.right, s);
    }
}
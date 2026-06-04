// Last updated: 6/4/2026, 10:34:41 AM
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
    public boolean dfs(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        return p.val==q.val && dfs(p.right,q.left) && dfs(p.left,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return dfs(root.right,root.left);
    }
}
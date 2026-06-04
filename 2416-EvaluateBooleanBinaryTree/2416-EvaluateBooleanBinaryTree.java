// Last updated: 6/4/2026, 10:25:51 AM
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
    public boolean evaluateTree(TreeNode root) {
        boolean ans = false;
        if(root==null) return true;
        if(root.val==1) return true;
        if(root.val==0) return false;
        if(root.val==2) {
            boolean left = evaluateTree(root.left);
            boolean right = evaluateTree(root.right);
            ans = left||right;
        } 
        if(root.val==3) {
            boolean left = evaluateTree(root.left);
            boolean right = evaluateTree(root.right);
            ans = left&&right;
        } 
        return ans;
    }
}
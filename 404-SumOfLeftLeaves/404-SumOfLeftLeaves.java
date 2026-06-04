// Last updated: 6/4/2026, 10:32:40 AM
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
    static int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        preoder(root);
       return sum;
    }
    public static void preoder(TreeNode root){
        if(root==null) return;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            sum+=root.left.val;
        }
        preoder(root.left);
        preoder(root.right);
    }
}
// Last updated: 6/4/2026, 10:31:26 AM
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
    static int s;
    public int rangeSumBST(TreeNode root, int low, int high) {
        s=0;
        sum(root,low,high);
        return s;

    }
    static void sum(TreeNode root,int low,int high)
    {
        if(root==null)
        return ;
        if(root.val>=low && root.val<=high)
        s=s+root.val;
        sum(root.left,low,high);
        sum(root.right,low,high);
    }
}
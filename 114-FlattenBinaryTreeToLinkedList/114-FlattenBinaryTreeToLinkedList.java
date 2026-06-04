// Last updated: 6/4/2026, 10:34:26 AM
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
    TreeNode dummy= new TreeNode(0);
        TreeNode temp =dummy;
    public void dfs(TreeNode root){
        if(root==null) return ;
        temp.right = new TreeNode(root.val);
        temp=temp.right;
        dfs(root.left);
        
        dfs(root.right);
    } 
    public void flatten(TreeNode root) {
        if(root==null) return;
        dfs(root);
        
        root.left = null;
       // root.right=null;
        
        root.val = dummy.right.val;
        root.right = dummy.right.right;
       
        
    }
}
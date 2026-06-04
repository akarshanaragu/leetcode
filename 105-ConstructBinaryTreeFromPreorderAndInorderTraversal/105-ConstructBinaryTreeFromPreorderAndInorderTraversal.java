// Last updated: 6/4/2026, 10:34:34 AM
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
    HashMap<Integer,Integer> h;
    int pi = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        h = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            h.put(inorder[i], i);
        int si = 0, li = inorder.length - 1;
        return dfs(preorder, si, li);
    }

    public TreeNode dfs(int[] preorder, int si, int li) {
        if (si <= li) {
            int el = preorder[pi++];
            int mid = h.get(el);
            TreeNode root = new TreeNode(el);
            root.left = dfs(preorder, si, mid - 1);
            root.right = dfs(preorder, mid + 1, li);
            return root;
        }
        return null;
    }
}
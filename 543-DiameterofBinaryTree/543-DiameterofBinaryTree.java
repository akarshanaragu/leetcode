// Last updated: 21/7/2026, 10:46:17 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    int dt = 0;
19
20    public int diameterOfBinaryTree(TreeNode root) {
21        diameter(root);
22        return dt;
23    }
24
25    public int diameter(TreeNode root) {
26
27        if (root == null)
28            return 0;
29
30        int l = diameter(root.left);
31        int r = diameter(root.right);
32        dt = Math.max(r + l, dt);
33
34        return Math.max(l, r) + 1;
35    }
36}
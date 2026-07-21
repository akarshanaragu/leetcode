// Last updated: 21/7/2026, 10:19:33 pm
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
18    public TreeNode invertTree(TreeNode rt) {
19
20        if(rt==null) return null;
21        
22        TreeNode t=rt.left;
23        rt.left=rt.right;
24        rt.right=t;
25        
26
27        invertTree(rt.left); invertTree(rt.right);
28        
29        return rt; 
30    }
31    
32}
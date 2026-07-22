// Last updated: 22/7/2026, 1:59:39 pm
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
17    public boolean is(TreeNode r, TreeNode s) {
18        if (r == null && s == null) {
19            return true;
20        }
21        if (r == null || s == null) {
22            return false;
23        }
24        return r.val == s.val && is(r.left, s.left) && is(r.right, s.right);
25    }
26
27    public boolean isSubtree(TreeNode r, TreeNode s) {
28        if (r == null) {
29            return false;
30        }
31        if (is(r, s)) {
32            return true;
33        }
34        return isSubtree(r.left, s) || isSubtree(r.right, s);
35    }
36}
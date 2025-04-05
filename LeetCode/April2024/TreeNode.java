//https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/description/?envType=daily-question&envId=2025-04-04


// Definition for a binary tree node.
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}     
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
 
class Solution {
    static class Pair {
        TreeNode node;
        int depth;
        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    private Pair findLCA(TreeNode curr) {
        if (curr == null) {
            return new Pair(null, 0);
        }

        Pair left = findLCA(curr.left);
        Pair right = findLCA(curr.right);

        if (left.depth == right.depth) {
            return new Pair(curr, 1 + left.depth);
        } else if (left.depth > right.depth) {
            return new Pair(left.node, 1 + left.depth);
        } else {
            return new Pair(right.node, 1 + right.depth);
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Pair res = findLCA(root);
        return res.node;
    }
}
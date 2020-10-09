package com.deanalvero.java.answers.leetcode.medium;

/**
 * Sum of Nodes with Even-Valued Grandparent
 */
public class SumOfNodesWithEvenValuedGrandparent {

    public static class TreeNode {
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

    public int sumEvenGrandparent(TreeNode root) {
        int[] sum = new int[1];

        traverse(sum, root, null, null);

        return sum[0];
    }

    public void traverse(int[] sum, TreeNode root, TreeNode parent, TreeNode grandparent) {
        if (root == null) {
            return;
        }

        if (grandparent != null && grandparent.val % 2 == 0) {
            sum[0] += root.val;
        }

        traverse(sum, root.left, root, parent);
        traverse(sum, root.right, root, parent);
    }
}

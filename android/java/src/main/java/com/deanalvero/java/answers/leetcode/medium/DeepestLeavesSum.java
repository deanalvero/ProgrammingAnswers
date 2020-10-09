package com.deanalvero.java.answers.leetcode.medium;

/**
 * Deepest Leaves Sum
 */
public class DeepestLeavesSum {
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

    public int deepestLeavesSum(TreeNode root) {
        int[] depth = new int[1];
        int[] sum = new int[1];
        traverse(depth, sum, root, 0);
        return sum[0];
    }

    public void traverse(int[] depth, int[] sum, TreeNode root, int currentDepth) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (currentDepth > depth[0]) {
                depth[0] = currentDepth;
                sum[0] = root.val;
            } else if (depth[0] == currentDepth) {
                sum[0] += root.val;
            }

        } else {
            traverse(depth, sum, root.left, currentDepth + 1);
            traverse(depth, sum, root.right, currentDepth + 1);
        }

    }
}

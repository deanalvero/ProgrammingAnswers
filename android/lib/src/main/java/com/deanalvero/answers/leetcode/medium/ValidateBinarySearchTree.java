package com.deanalvero.answers.leetcode.medium;

public class ValidateBinarySearchTree {
    static class TreeNode {
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

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer minVal, Integer maxVal) {
        if (root == null) {
            return true;
        }
        return (minVal == null || root.val > minVal)
                && (maxVal == null || root.val < maxVal)
                && isValidBST(root.left, minVal, root.val)
                && isValidBST(root.right, root.val, maxVal);

    }
}

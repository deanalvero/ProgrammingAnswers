package com.deanalvero.answers.leetcode.easy;

public class RangeSumOfBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        return getTotal(root, L, R);
    }

    private int getTotal(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        int value = root.val;
        int result = 0;

        if (value >= L && value <= R) {
            result += value;
        }

        int leftValue = getTotal(root.left, L, R);
        int rightValue = getTotal(root.right, L, R);

        return result + leftValue + rightValue;
    }

}

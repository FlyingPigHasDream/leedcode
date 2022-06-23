package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/30 11:58
 */
public class m9 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    boolean isSymmetrical(TreeNode pRoot) {
        return solve(pRoot.left, pRoot.right);
    }

    public boolean solve(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        return solve(left.left, left.right) & solve(right.left, right.right);
    }
}

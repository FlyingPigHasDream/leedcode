package com.leedcode.code;

import javax.swing.tree.TreeNode;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/30 11:43
 */
public class m8 {


      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
          this.val = val;
        }
      }

    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }

        TreeNode right = Mirror(pRoot.right);
        TreeNode left = Mirror(pRoot.left);
        pRoot.right = left;
        pRoot.left = right;
        return pRoot;
    }
}

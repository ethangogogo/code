package com.example.demo.leetcode;

import com.example.demo.model.TreeNode;

public class LowestCommonAncestor_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if (hasNode(root.left, p)) {
            if (hasNode(root.right, q)) {
                return root;
            } else {
                return lowestCommonAncestor(root.left, p ,q);
            }
        }

        if (hasNode(root.right, p)) {
            if (hasNode(root.left, q)) {
                return root;
            } else {
                return lowestCommonAncestor(root.right, p, q);
            }
        }

        return null;
    }

    private boolean hasNode(TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }

        if (root.val == node.val) {
            return true;
        }

        boolean hasN = hasNode(root.right, node);

        if (!hasN) {
            hasN = hasNode(root.left, node);
        }

        return hasN;
    }
}

package com.example.demo.leetcode;

import com.example.demo.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTree_105 {
    public TreeNode buildTree(int[] preOrder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<inorder.length;i++) {
            map.put(inorder[i], i);
        }

        return build(preOrder, 0, preOrder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preOrder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd, Map<Integer, Integer> map) {
        if (pStart > pEnd) {
            return null;
        }

        int root = preOrder[pStart];
        TreeNode treeNode = new TreeNode(root);
        int index = map.get(root);
        int len = index - iStart;
        treeNode.left = build(preOrder, pStart + 1, pStart + len, inorder, iStart, index - 1, map);
        treeNode.right = build(preOrder, pStart + len + 1, pEnd, inorder, index + 1, iEnd, map);

        return treeNode;
    }

}

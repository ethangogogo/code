package com.example.demo.leetcode;

import com.example.demo.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            int i = 0;
            while (i < size) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                i++;
            }
            result.add(tmp);
        }
        return result;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            int size = queue.size();
            int i = 0;
            while (i < size) {
                TreeNode node = queue.poll();
                if (flag) {
                    tmp.addLast(node.val);
                } else {
                    tmp.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                i++;
            }
            flag = !flag;
            result.add(tmp);
        }
        return result;
    }
}

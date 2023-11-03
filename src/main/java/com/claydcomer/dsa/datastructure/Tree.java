package com.claydcomer.dsa.datastructure;

import com.claydcomer.dsa.model.TreeNode;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot == null) {
            return null;
        }

        if(value < subtreeRoot.getData()) {
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
        } else {
            //Node to delete has 0 or 1 children\\
            if(subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight();
            } else if(subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft();
            }

            //Node to delete has 2 children\\
            //Replace the value in the subtreeRoot node with the smallest value from the right subtree
            subtreeRoot.setData(subtreeRoot.getRight().min());

            //Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        return root.min();
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        return root.max();
    }

    public void traverseInOrder() {
        if(root != null) {
            root.traverseInOrder();
        }
    }
}

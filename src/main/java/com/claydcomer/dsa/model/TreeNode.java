package com.claydcomer.dsa.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value == data) {
            return;
        }

        if(value < data) {
            if(left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if(value == data) {
            return this;
        }

        if(value < data) {
            if(left != null) {
                return left.get(value);
            }
        } else {
            if(right != null) {
                return right.get(value);
            }
        }

        return null;
    }

    public int min() {
        if(left == null) {
            return data;
        } else {
            return left.min();
        }
    }

    public int max() {
        if(right == null) {
            return data;
        } else {
            return right.max();
        }
    }

    public void traverseInOrder() {
        if(left != null) {
            left.traverseInOrder();
        }
        System.out.print(data + ", ");
        if(right != null) {
            right.traverseInOrder();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}

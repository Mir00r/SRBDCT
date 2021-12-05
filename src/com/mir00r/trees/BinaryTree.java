package com.mir00r.trees;

import java.util.*;

/**
 * @author mir00r on 14/6/21
 * @project IntelliJ IDEA
 */

class Node {
    int data;
    int horizontalDistance;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.horizontalDistance = Integer.MAX_VALUE;
        this.left = this.right = null;
    }
}

class Tree {
    int treeSum(Node node) {
        if (node == null) return 0;
        int leftSum = treeSum(node.left);
        int rightSum = treeSum(node.right);
        return node.data + leftSum + rightSum;
    }

    int treeMax(Node node) {
        if (node == null) return Integer.MIN_VALUE;
        int leftMax = treeMax(node.left);
        int rightMax = treeMax(node.right);
        return Math.max(Math.max(node.data, leftMax), rightMax);
    }

    int treeMin(Node node) {
        if (node == null) return Integer.MAX_VALUE;

        int leftMin = treeMin(node.left);
        int rightMin = treeMin(node.right);
        return Math.min(Math.min(node.data, leftMin), rightMin);
    }

    int treeHeight(Node node) {
        if (node == null) return 0;
        int leftHeight = treeHeight(node.left);
        int rightHeight = treeHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    boolean existInTree(Node node, int value) {
        if (node == null) return false;
        boolean inLeft = existInTree(node.left, value);
        boolean inRight = existInTree(node.right, value);
        return node.data == value || inLeft || inRight;
    }

    boolean isBST(Node node, int minValue, int maxValue) {
        if (node == null) return true;
        else if (!(minValue < node.data && node.data < maxValue)) return false;
        else {
            boolean inLeft = isBST(node.left, minValue, node.data);
            boolean inRight = isBST(node.right, node.data, maxValue);
            return inLeft && inRight;
        }
    }

    void reverseTree(Node node) {
        if (node == null) return;

        // swap the node data
        final Node temp = node.right;
        node.right = node.left;
        node.left = temp;

        reverseTree(node.left);
        reverseTree(node.right);
        System.out.println(node.data);
    }

    void bottomView(Node node) {
        if (node == null) return;

        int horizontalDistance = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();

        node.horizontalDistance = horizontalDistance;
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();

            horizontalDistance = temp.horizontalDistance;
            map.put(horizontalDistance, temp.data);

            if (temp.left != null) {
                temp.left.horizontalDistance = horizontalDistance - 1;
                queue.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.horizontalDistance = horizontalDistance + 1;
                queue.add(temp.right);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        for (Map.Entry<Integer, Integer> me : set) {
            System.out.print(me.getValue() + " ");
        }
    }

    // ------------ tree travers ----------------- //

    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

}

public class BinaryTree {

    private static Node initData() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(5);
        root.right.left = new Node(7);
        return root;
    }

    private static Node initBSTData() {
        Node root = new Node(15);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.right.right = new Node(31);
        root.right.left = new Node(18);
        return root;
    }

    public static void main(String[] args) {
//        new Tree().reverseTree(initData());
//        System.out.println(new Tree().isBST(initBSTData(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        new Tree().bottomView(initData());
    }
}

/*

       1
    2    3
  4  6   7   5
*/

package com.mir00r.linked_list;

/**
 * @author mir00r on 14/3/20
 * @project IntelliJ IDEA
 */
public class PrintMiddle {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void printMiddleNode() {
        Node fastPtr = head;
        Node slowPtr = head;

        if (head != null) {
            while (fastPtr != null && fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            System.out.println("The middle element is [" +
                    slowPtr.data + "] \n");
        }
    }
}

package com.mir00r.linked_list;

/**
 * @author mir00r on 20/3/20
 * @project IntelliJ IDEA
 */
public abstract class MyLinkedList {
    PrintMiddle.Node head;

    static class Node {
        int data;
        PrintMiddle.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int newData) {
        PrintMiddle.Node newNode = new PrintMiddle.Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        PrintMiddle.Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }
}

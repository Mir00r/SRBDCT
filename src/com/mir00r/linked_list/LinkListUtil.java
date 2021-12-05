package com.mir00r.linked_list;

import java.util.HashSet;

/**
 * @author mir00r on 5/11/21
 * @project IntelliJ IDEA
 */
public class LinkListUtil {

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

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node temp = current;

            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    public void removeUnsortedDuplicate() {
        Node ptr1, ptr2;
        ptr1 = head;

        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
            if (ptr1 != null)
                System.out.println("Finally ptr1: " + ptr1.data);
            System.out.println("Finally ptr2: " + ptr2.data);
        }
    }

    public void removeUnsortedDuplicate1() {
        Node current = head;
        Node prev = null;
        HashSet<Integer> hs = new HashSet<>();

        while (current != null) {
            int currentDate = current.data;

            if (hs.contains(currentDate)) {
                prev.next = current.next;
//                System.out.println("Prev data: "+prev.data);
            } else {
                hs.add(currentDate);
                prev = current;
//                System.out.println("Prev data 2: "+prev.data);
            }
            current = current.next;
        }
    }

    public static void prepareDate() {
        LinkListUtil llist = new LinkListUtil();

        llist.push(10);
        llist.push(12);
        llist.push(11);
        llist.push(11);
        llist.push(12);
        llist.push(11);
        llist.push(10);

        System.out.println("Given Linked llist");
        llist.print();
        llist.reverse();
        System.out.println("");
        System.out.println("Reversed linked list ");
        llist.print();




        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
//        Node start = new Node(10);
//        start.next = new Node(12);
//        start.next.next = new Node(11);
//        start.next.next.next = new Node(11);
//        start.next.next.next.next = new Node(12);
//        start.next.next.next.next.next = new Node(11);
//        start.next.next.next.next.next.next = new Node(10);

//        System.out.println("List before removal of duplicates");
//        llist.print();
//
//        llist.reverse();
//
//        System.out.println("List after removal of elements");
//        llist.print();
    }
}

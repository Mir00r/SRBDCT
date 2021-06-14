package com.mir00r.queue;

/**
 * @author mir00r on 3/7/20
 * @project IntelliJ IDEA
 */
public class MyCircularDeque {
    int rear, front, capacity;
    int[] myArray;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        myArray = new int[k + 1];
        rear = 0;
        front = 0;
        capacity = myArray.length;
    }

    /**x
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        myArray[front] = value;
        front = (front + 1) % capacity;
        System.out.println("Front -> " + front);
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        rear = (rear - 1 + capacity) % capacity;
        System.out.println("Rear -> " + rear);
        myArray[rear] = value;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front - 1 + capacity) % capacity;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear + 1) % capacity;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        return isEmpty() ? -1 : myArray[(front - 1 + capacity) % capacity];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        return isEmpty() ? -1 : myArray[rear];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return (front + 1) % capacity == rear;
    }
}

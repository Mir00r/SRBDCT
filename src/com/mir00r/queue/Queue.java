package com.mir00r.queue;

/**
 * @author mir00r on 2019-10-03
 * @project IntelliJ IDEA
 */
public class Queue {
    private int rear;
    private int size;
    private int front;
    private int capacity;
    private int[] array;

    public Queue(int capacity) {
        this.rear = capacity - 1;
        this.size = 0;
        this.front = 0;
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }

    public boolean isFull(Queue queue) {
        return (queue.size == capacity);
    }

    public boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(int item) {
        if (isFull(this)) return;

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        //System.out.println(item + " Push to queue");
    }

    public int pop() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1) % capacity;
        this.size = this.size - 1;
        //System.out.println(item + " Pop from queue");
        return item;
    }

    public int front() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    public int rear() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
}

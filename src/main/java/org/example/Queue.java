package org.example;

public class Queue {

    //a Queue is a data structure that follows the FIFO principle
    //first in first out
    //we use the arraylist class to create a queue

    private final ArrayList queue;

    public Queue() {
        queue = new ArrayList();
    }

    public void enqueue(Object o) {
        queue.add(o);
    }

    public Object dequeue() {
        Object o = queue.get(0);
        queue.remove(0);
        return o;
    }

    public Object peek() {
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void print() {
        queue.print();
    }


}

package stackqueue;

import linkedlist.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(T data) {
        linkedList.append(data);
    }

    public void printQueue() {
        linkedList.printList();
    }
}

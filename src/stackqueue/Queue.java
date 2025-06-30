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

    public T dequeue() {
        if (linkedList.isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }
        T frontData = linkedList.getHeadData();
        linkedList.pop();  // remove head
        return frontData;
    }

    public void printQueue() {
        linkedList.printList();
    }
}

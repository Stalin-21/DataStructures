package stackqueue;

import linkedlist.LinkedList;

public class Stack<T> {
    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    public void push(T data) {
        linkedList.addAtHead(data);
    }

    public T peek() {
        if (linkedList.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return linkedList.getHeadData();
    }

    public T pop() {
        if (linkedList.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        T topData = linkedList.getHeadData();
        linkedList.pop();  // Remove head
        return topData;
    }

    public void printStack() {
        linkedList.printList();
    }
}

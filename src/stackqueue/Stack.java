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

    public void printStack() {
        linkedList.printList();
    }
}


package linkedlist;

public class LinkedList<T> {
    private Node<T> head;  // Now explicitly private for encapsulation

    public void addAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
        }
    }

    public void insertAfter(T targetData, T newData) {
        Node<T> current = head;
        while (current != null && !current.data.equals(targetData)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Target node not found.");
            return;
        }
        Node<T> newNode = new Node<>(newData);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("List is empty. Nothing to pop.");
            return;
        }
        head = head.next;
    }

    public void popLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to pop last.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public boolean search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void deleteNode(T key) {
        if (head == null) return;

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(key)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public T getHeadData() {
        return (head != null) ? head.data : null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

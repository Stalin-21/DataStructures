public class LinkedList<T> {
    Node<T> head;

    public void addAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(T data) {
        if (head == null) {
            Node<T> newNode = new Node<>(data);
            head = newNode;
        }else{
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
        }
    }

    public void insertAfter(T targerData, T newData) {
        Node<T> current = head;
        while(current != null && !current.data.equals(targerData)) {
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

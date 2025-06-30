public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
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

public class Main {
    public static void main(String[] args) {
       Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);

        node1.next = node2;
        node2.next = node3;

       printList(node1);

    }

    public static <T> void printList(Node<T> head) {
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
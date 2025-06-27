public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Use Case 3
        list.append(56);
        list.append(30);
        list.append(70);

        list.insertAfter(30,46);  // Use Case 4

        list.printList();

    }
}
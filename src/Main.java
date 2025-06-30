public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();


        // UC 1 + UC 2 + UC 3: Create list with append
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.print("Created list: " );
        list.printList();

        // Use Case 4
        list.insertAfter(30,46);

        System.out.print("List before pop: ");
        list.printList();

        // UC 5: Pop first element
        list.pop();  // Pop the first element 56
        System.out.print("List after popping head: ");
        list.printList();


        // UC 6: Pop last element
        list.popLast();
        System.out.print("List after popping last: ");
        list.printList();

        // UC 7: Search for 30
        boolean found = list.search(30);
        System.out.println("Search for 30: " + (found ? "Found" : "Not Found"));

        //UC 8: Insert 40 after 30
        list.insertAfter(30, 40);
        list.printList();

        // UC 9: Delete 40 and print size
        list.deleteNode(40);
        System.out.print("UC9 List after deleting 40: ");
        list.printList();  // 30
        System.out.println("UC9 Size of list: " + list.size());

        // UC 10: Sorted List
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);
        sortedList.printList();  // Output: 30 -> 40 -> 56 -> 70

    }
}
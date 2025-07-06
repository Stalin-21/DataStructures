package bst;

public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        // UC1: Add 56, 30, 70
        tree.add(56);
        tree.add(30);
        tree.add(70);

        System.out.print("In-order traversal after UC1: ");
        tree.inOrder();
        System.out.println();

        // UC2: Add remaining nodes to form full tree
        tree.add(22);
        tree.add(40);
        tree.add(60);
        tree.add(95);
        tree.add(11);
        tree.add(3);
        tree.add(16);
        tree.add(65);
        tree.add(63);
        tree.add(67);

        System.out.print("In-order traversal after UC2: ");
        tree.inOrder();
        System.out.println();

        // UC2: Print size
        System.out.println("Size of tree: " + tree.size());
    }
}

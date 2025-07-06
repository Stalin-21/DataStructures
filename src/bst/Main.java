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
    }
}

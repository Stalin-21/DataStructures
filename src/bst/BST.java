package bst;

public class BST<T extends Comparable<T>> {
    private Node<T> root;

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private Node<T> addRecursive(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }
        if (data.compareTo(current.data) < 0) {
            current.left = addRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node<T> node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }
}

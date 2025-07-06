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

    public boolean search(T key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node<T> current, T key) {
        if (current == null) {
            return false;
        }
        if (current.data.equals(key)) {
            return true;
        }
        if (key.compareTo(current.data) < 0) {
            return searchRec(current.left, key);
        } else {
            return searchRec(current.right, key);
        }
    }


    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeRecursive(node.left) + sizeRecursive(node.right);
    }
}

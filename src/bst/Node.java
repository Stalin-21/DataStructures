package bst;

public class Node<T extends Comparable<T>> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

package hashtable;

public class MyHashTable<K, V extends Integer> {
    private final int size = 10;
    private MyMapNode<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        buckets = (MyMapNode<K, V>[]) new MyMapNode[size];
    }

    private int getIndex(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % size;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        MyMapNode<K, V> head = buckets[index];

        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                Integer freq = (Integer) current.getValue();
                freq = freq + 1;
                current.setValue((V) freq);
                return;
            }
            current = current.getNext();
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.setNext(head);
        buckets[index] = newNode;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            MyMapNode<K, V> current = buckets[i];
            while (current != null) {
                System.out.println(current.getKey() + " -> " + current.getValue());
                current = current.getNext();
            }
        }
    }
}

package stackqueue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // UC1: Push elements
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.print("Stack after UC1 pushes: ");
        stack.printStack();  // print: 56 -> 30 -> 70

        System.out.println("\nUC2: Peek and pop elements");
        while (true) {
            Integer top = stack.peek();
            if (top == null) break;  // stack is empty
            System.out.println("Peeked: " + top);
            System.out.println("Popped: " + stack.pop());
            System.out.print("Current stack: ");
            stack.printStack();
        }

        System.out.println("================ QUEUE ==============");
        Queue<Integer> queue = new Queue<>();

        // UC3: Enqueue 56, 30, 70
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.print("Queue after UC3 enqueues: ");
        queue.printQueue();
    }

}

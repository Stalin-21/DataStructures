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
    }
}

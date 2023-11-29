public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Print the elements in the stack
        System.out.println("Stack elements:");
        stack.printStack();

        // Peek and Pop elements from the stack until it is empty
        while (!stack.isEmpty()) {
            System.out.println("Peeked element: " + stack.peek());
            System.out.println("Popped element: " + stack.pop());
        }

        // Print the elements in the stack after pop operations
        System.out.println("Stack elements after pop:");
        stack.printStack(); // Should print "Empty Stack" or similar
    }
}

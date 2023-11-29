import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // Push operation, adds an element to the top of the stack
    public void push(T element) {
        list.add(element);
    }

    // Pop operation, removes and returns the element from the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeLast();
    }

    // Peek operation, returns the element from the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Print the elements in the stack
    public void printStack() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

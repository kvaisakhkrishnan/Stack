import java.util.LinkedList;


class Queue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // Enqueue operation, adds an element to the end of the queue
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Dequeue operation, removes and returns the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Print the elements in the queue
    public void printQueue() {
        for (T element : list) {
            System.out.println("->" + element);
        }
    }
}


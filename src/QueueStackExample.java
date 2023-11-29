public class QueueStackExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        // Enqueue elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Print the elements in the queue
        System.out.println("Queue elements:");
        queue.printQueue();

        // Dequeue elements from the front of the queue until it becomes empty
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element from the front: " + queue.dequeue());
        }

        // Print the elements in the queue after dequeue operations
        System.out.println("Queue elements after dequeue:");
        queue.printQueue(); // Should print "Empty Queue" or similar
    }
}
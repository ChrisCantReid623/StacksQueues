import java.util.Objects;

/** Christopher Reid
 * CSC 210 Fall 2022
 * PA4
 * Simulates a FIFO queue data structure by using a linked list. */

class ListQueue implements QueueInterface{
    private LinkedList queue;

    /** Constructor */
    ListQueue() {
        queue = new LinkedList();
    }

    /** Copy Constructor */
    ListQueue(ListQueue original) {
        queue = new LinkedList(original.queue);
    }

    /** Pushes a new value at the back of the queue.
     * Time Complexity: O(n) */
    public void enqueue(int value) {
        queue.addLast(value);
    }

    /** Removes the value at the front of the queue.
     * Time Complexity: O(1) */
    public int dequeue() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.removeFirst();
    }

    /** Identifies the value at the front of the queue.
     * Time Complexity: O(1) */
    public int peek() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.get(0);
    }

    /** Identifies if the queue is empty.
     * Time Complexity: O(1) */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /** Returns the number of nodes.
     * Time Complexity: O(1) */
    public int size() {
        return queue.size();
    }

    /** Removes all data.
     * Time Complexity: O(1) */
    public void clear() {
        queue.clear();
    }

    /** Returns a combined strong of the queue contents.
     * Time Complexity: O(n) */
    public String toString() {
        return queue.toString();
    }

    /** Identifies if two arrays are equal size and contain identical values.
     * Time Complexity: O(n) */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        ListQueue compared = (ListQueue)o;
        return queue.equals(compared.queue);
    }
}
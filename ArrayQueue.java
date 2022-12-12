/** Christopher Reid
 * CSC 210 Fall 2022
 * PA4
 * Simulates a FIFO queue data structure by using a dynamic array. */

class ArrayQueue implements QueueInterface{
    private DynamicArray queue;

    /** Constructor */
    ArrayQueue() {
        queue = new DynamicArray();
    }

    /** Copy Constructor */
    ArrayQueue(ArrayQueue original) {
        queue = new DynamicArray(original.queue);
    }

    /** Pushes a new value at the back of the queue.
     * Time Complexity: O(1) amortized */
    public void enqueue(int value) {
        queue.add(value);
    }

    /** Removes the value at the front of the queue.
     * Time Complexity: O(n) or O(1) */
    public int dequeue() {
        if (queue.isEmpty()) {
            return -1;
        }
        int removed = queue.get(0);
        queue.remove(0);
        return removed;
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

    /** Returns the number of occupied elements.
     * Time Complexity: O(1) */
    public int size() {
        return queue.size();
    }

    /** Removes all data.
     * Time Complexity: O(n) */
    public void clear() {
        queue.clear();
    }

    /** Returns a combined string of the queue contents.
     * Time Complexity: O(n) */
    public String toString() {
        return queue.toString();
    }

    /** Identifies if two arrays are equal size and contain identical values.
     * Time Complexity: O(n) */
    public boolean equals(Object original) {
        if (this == original) {
            return true;
        }
        if (original == null) {
            return false;
        }
        if (getClass() != original.getClass()) {
            return false;
        }

        ArrayQueue compared = (ArrayQueue)original;
        return queue.equals(compared.queue);
    }
}

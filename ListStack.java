/** Christopher Reid
 * CSC 210 Fall 2022
 * PA4
 * Simulates a LIFO stack data structure by using a linked list. */

class ListStack implements StackInterface{
    private LinkedList stack;

    /** Constructor */
    ListStack() {
        stack = new LinkedList();
    }

    /** Copy Constructor */
    ListStack(ListStack original) {
        stack = new LinkedList(original.stack);
    }

    /** Adds data to the top of the stack.
     * Time Complexity: O(1) */
    public void push(int value) {
        stack.addLast(value);
    }

    /** Removes the data at the top of the stack.
     * Time Complexity: O(1) */
    public int pop() {
        int removed = stack.getLast();
        if (stack.isEmpty()) {
            return -1;
        } else {
            stack.removeLast();
            return removed;
        }
    }

    /** Identifies the value at the top of the stack.
     * Time Complexity: O(1) */
    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.getLast();
    }

    /** Identifies if a stack is empty.
     * Time Complexity: O(1) */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /** Returns the number of occupied elements in the stack.
     * Time Complexity: O(1) */
    public int size() {
        return stack.size();
    }

    /** Removes all data from the stack.
     * Time Complexity: O(1) */
    public void clear() {
        stack.clear();
    }

    /** Returns a combined string of the stack contents.
     * Time Complexity: O(n) */
    public String toString() {
        return stack.toString();
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

        ListStack compared = (ListStack)original;
        return stack.equals(compared.stack);
    }
}

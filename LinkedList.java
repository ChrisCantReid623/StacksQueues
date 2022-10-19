/** Christopher Reid
 * CSC 210 Fall 2022
 * PA4
 * A linked list class. */

class LinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /** Default Constructor */
    LinkedList() {}

    /** Copy Constructor */
    LinkedList(LinkedList original) {
        head = new Node(original.head.data);
        size = original.size;
        Node nextCopy = original.head.next;
        Node current = head;

        while (nextCopy != null) {
            Node newCopy = new Node(nextCopy.data);
            newCopy.next =  nextCopy.next;
            current.next = newCopy;
            current = newCopy;
            nextCopy = newCopy.next;
        }
        tail = current;
    }

    /** Adds a new node.
     * Time Complexity: O(n) */
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /** Returns the data stored in the last node.
     * Time Complexity: O(1) */
    public int getLast() {
        return tail.data;
    }

    /** Returns the data stored in a node at a specified index.
     * Time Complexity: O(n) */
    public int get(int index) {
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }

    /** Removes the last node.
     * Time Complexity: O(n) */
    public void removeLast() {
        Node currNode = head;

        if (head != null) {
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            currNode.next = null;
            tail = currNode;
        }
        size--;
    }

    /** Removes the first node.
     * Time Complexity: O(1) */
    public int removeFirst() {
        int removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    /** Returns a combined string of the list data.
     * Time Complexity O(n) */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder str = new StringBuilder();
        str.append('{');
        Node currNode = head;
        while (currNode != null) {
            str.append(currNode.data);
            if (currNode.next != null) {
                str.append(",");
            }
            currNode = currNode.next;
        }
        str.append('}');
        return str.toString();
    }

    /** Returns the number of nodes.
     * Time Complexity O(1) */
    public int size() {
        return size;
    }

    /** Removes all nodes.
     * Time Complexity O(1) */
    public void clear() {
        head = null;
        size = 0;
    }

    /** Identifies if the list is empty.
     * Time Complexity O(1) */
    public boolean isEmpty() {
        return head == null;
    }

    /** Identifies if two lists are equal size and contain identical values.
     * Time Complexity O(n) */
    public boolean equals(LinkedList compared) {
        if (size == compared.size) {
            Node head1 = head;
            Node head2 = compared.head;
            while (head1 != null && head2 != null) {
                if (head.data != compared.head.data) {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
            return true;
        }
        return false;
    }
}
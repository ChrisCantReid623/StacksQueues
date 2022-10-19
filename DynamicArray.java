/** Christopher Reid
 * CSC 210 Fall 2022
 * PA4
 * Uses a standard array capable of modifying its size to store additional elements. */

class DynamicArray {
    public int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 3;

    /** Constructor */
    DynamicArray() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /** Copy Constructor */
    DynamicArray(DynamicArray original) {
        this.array = original.array;
        this.size = original.size;
    }

    /**Adds an element. Extends the array if adding an element beyond the limits of the current array capacity.
     * Time Complexity: O(1) */
    public void add(int value) {
        if (size >= array.length)
            resize(2*array.length);
        array[size] = value;
        size++;
    }

    /** Identifies data at a specified index.
     * Time Complexity O(1) */
    public int get(int index) {
        return array[index];
    }

    /** Removes data at a specified index.
     * Time Complexity: O(n) */
    public void remove(int index) {
        int[] newArray = new int[array.length -1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i!= index) {
                newArray[k] = array[i];
                k++;
            }
        }
        this.array = newArray;
        size--;
    }

    /** Creates a resized array with extended capacity.
     * Time Complexity: O(n) */
    private void resize(int capacity) {
        int[] temp = new int[capacity];
        size = capacity < size ? capacity:size;
        for (int i = 0; i < size; i++)
            temp[i] = array[i];
        array = temp;
    }

    /** Returns the number of occupied elements
     * Time Complexity O(1)*/
    public int size() {
        return size;
    }

    /** Determines if the array is empty.
     * Time Complexity O(1)*/
    public boolean isEmpty() {
        return size == 0;
    }

    /** Sets all elements to 0.
     * Time Complexity O(n) */
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        size = 0;
    }

    /** Returns a combined string of the array data.
     * Time Complexity: O(n) */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder str = new StringBuilder();
        str.append('{');
        for (int i = 0; i < size; i++) {
            str.append(array[i]);
            if (i + 1 < size) {
                str.append(",");
            }
        }
        str.append('}');
        return str.toString();
    }

    /** Identifies if two arrays are equal size and contain identical values.
     * Time Complexity: O(n) */
    public boolean equals(DynamicArray compared) {
        if (size == compared.size) {
            for (int a = 0; a < size - 1; a++) {
                if (get(a) != compared.get(a)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
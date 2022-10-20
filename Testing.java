import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        ListStack testObject = new ListStack();
//        ArrayQueue testObject = new ArrayQueue();
//        ListStack testObject = new ListStack();
//        ListQueue testObject = new ListQueue();

        for (int i = 1; i < 10; i++) {
            testObject.push(i);
        }

        ListStack deepCopy = new ListStack(testObject);

//        ArrayQueue deepCopy = new ArrayQueue(testObject);
//        ListStack deepCopy = new ListStack(testObject);
//        ListQueue deepCopy = new ListQueue(testObject);


        //----------- TEST CODE -------------------

//        System.out.println("-------------------------------");
//        System.out.println("Testing " + testObject.getClass());
//        System.out.println("-------------------------------");
//
//        System.out.println("Original: " + testObject);
//        System.out.println("Original Size: " + testObject.size());
//        System.out.println("Empty: " + testObject.isEmpty());
//        System.out.println("Next Out: " + testObject.peek());
//        System.out.println();
//        System.out.println("Clone: " + deepCopy);
//        System.out.println("Clone Size: " + deepCopy.size());
//        System.out.println("Empty: " + deepCopy.isEmpty());
//        System.out.println("Next Out: " + deepCopy.peek());
//        System.out.println();
//        System.out.println("Equal: " + testObject.equals(deepCopy));
//        System.out.println("-------------------------------");
//
//        deepCopy.push(44);
//        System.out.println("Original: " + testObject);
//        System.out.println("Original Size: " + testObject.size());
//        System.out.println("Empty: " + testObject.isEmpty());
//        System.out.println("Next Out: " + testObject.peek());
//        System.out.println();
//        System.out.println("Clone: " + deepCopy);
//        System.out.println("Clone Size: " + deepCopy.size());
//        System.out.println("Empty: " + deepCopy.isEmpty());
//        System.out.println("Next Out: " + deepCopy.peek());
//        System.out.println();
//        System.out.println("Equal: " + testObject.equals(deepCopy));
//        System.out.println("-------------------------------");
//
//        deepCopy.clear();
//        testObject.clear();
//        System.out.println("Original: " + testObject);
//        System.out.println("Original Size: " + testObject.size());
//        System.out.println("Empty: " + testObject.isEmpty());
//        System.out.println("Next Out: " + testObject.peek());
//        System.out.println();
//        System.out.println("Clone: " + deepCopy);
//        System.out.println("Clone Size: " + deepCopy.size());
//        System.out.println("Empty: " + deepCopy.isEmpty());
//        System.out.println("Next Out: " + deepCopy.peek());
//        System.out.println();
//        System.out.println("Equal: " + testObject.equals(deepCopy));
//        System.out.println("-------------------------------");
//
//        testObject.push(9);
//        testObject.push(11);
//        deepCopy.push(9);
//        deepCopy.push(11);
//        System.out.println("Original: " + testObject);
//        System.out.println("Original Size: " + testObject.size());
//        System.out.println("Empty: " + testObject.isEmpty());
//        System.out.println("Next Out: " + testObject.peek());
//        System.out.println();
//        System.out.println("Clone: " + deepCopy);
//        System.out.println("Clone Size: " + deepCopy.size());
//        System.out.println("Empty: " + deepCopy.isEmpty());
//        System.out.println("Next Out: " + deepCopy.peek());
//        System.out.println();
//        System.out.println("Equal: " + testObject.equals(deepCopy));

    }
}

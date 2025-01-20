import java.util.Deque;
import java.util.ArrayDeque;

public class Stacks {
    // Deque to store stack elements
    private Deque<Integer> deque;

    // Constructor to initialize the deque
    public Stacks() {
        deque = new ArrayDeque<>();
    }

    // Push operation (add element to the stack)
    public void push(int ele) {
        deque.addFirst(ele); // Add element to the front (top of the stack)
    }

    // Pop operation (remove element from the stack)
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return;
        }
        deque.removeFirst(); // Remove the front element (top of the stack)
    }

    // Top operation (peek the element at the top of the stack)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return deque.peekFirst(); // Get the front element (top of the stack) without removing
    }

    // Size operation (get the number of elements in the stack)
    public int size() {
        return deque.size();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Search for an element in the stack
    public boolean search(int value) {
        return deque.contains(value);
    }

    // Traverse the stack (print all elements)
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack content: ");
        for (int ele : deque) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();

        // Push elements onto the stack
        stack.push(12);
        stack.push(13);
        stack.push(15);
        stack.push(19);

        // Display the top of the stack, size, and check if the stack is empty
        System.out.println("Top of stack: " + stack.top());  // Should print 19
        System.out.println("Stack size: " + stack.size());   // Should print 4
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false

        // Traverse the stack
        stack.traverse();  // Should print 19 15 13 12

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Display the top of the stack after pops
        System.out.println("Top of stack after pops: " + stack.top());  // Should print 13

        // Search for an element
        System.out.println("Is 13 present in stack? " + stack.search(13));  // Should print true
        System.out.println("Is 12 present in stack? " + stack.search(12));  // Should print false
    }
}

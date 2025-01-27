import java.util.Deque;
import java.util.ArrayDeque;

public class Stacks {
    private Deque<Integer> deque;

    public Stacks() {
        deque = new ArrayDeque<>();
    }

    public void push(int ele) {
        deque.addFirst(ele); 
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return;
        }
        deque.removeFirst(); 
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return deque.peekFirst(); 
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public boolean search(int value) {
        return deque.contains(value);
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int ele : deque) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();

        stack.push(12);
        stack.push(13);
        stack.push(15);
        stack.push(19);
        System.out.println("Top of stack: " + stack.top());  
        System.out.println("Stack size: " + stack.size());   
        System.out.println("Is stack empty? " + stack.isEmpty()); 
        stack.traverse(); 
        stack.pop();
        stack.pop();
        System.out.println("Top of stack after pops: " + stack.top());  
        System.out.println("Is 13 present in stack? " + stack.search(13));  
        System.out.println("Is 12 present in stack? " + stack.search(12)); 
    }
}

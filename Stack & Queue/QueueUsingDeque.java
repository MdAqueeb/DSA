import java.util.Deque;
import java.util.ArrayDeque;

public class QueueUsingDeque {

    private Deque<Integer> deque;

    public QueueUsingDeque() {
        deque = new ArrayDeque<>();
    }

    public void enqueue(int ele) {
        deque.addLast(ele); 
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return;
        }
        deque.removeFirst(); 
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
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

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue content: ");
        for (int ele : deque) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingDeque queue = new QueueUsingDeque();

        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(15);
        queue.enqueue(19);
        System.out.println("Top of Queue" + queue.front());  
        System.out.println("Queue size: " + queue.size());       
        System.out.println("queue empty " + queue.isEmpty()); 
        queue.traverse();  
        queue.dequeue();
        queue.dequeue();
        System.out.println("Top of Queue" + queue.front());
        System.out.println("The given value present in queue" + (queue.front() == 13));// Should print false
    }
}

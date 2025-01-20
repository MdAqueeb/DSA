class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    static Node front = null;
    static Node rear = null;
    static int size = 0;

    public static void main(String[] args) {
        enqueue(new Node(12));
        enqueue(new Node(13));
        enqueue(new Node(15));
        dequeue();
        dequeue();
        System.out.println("Top of Queue : "+peek()); 
        System.out.println("Size of Queue "+length());   
        System.out.println("Check Empty Queue"+isEmpty()); 
        traverse();
        clear();
        traverse();
    }

    static void enqueue(Node ele) {
        if (rear == null) {
            front = rear = ele;
        } else {
            rear.next = ele;
            rear = ele;
        }
        size += 1;
    }

    static void dequeue() {
        if (size == 0) {
            return;  
        }
        front = front.next;
        if (front == null) {
            rear = null;  
        }
        size -= 1;
    }

    static int peek() {
        if (front == null) {
            return -1;  
        }
        return front.data;
    }

    static int length() {
        return size;
    }

    static boolean isEmpty() {
        return size == 0;
    }

    static void traverse() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void clear() {
        front = rear = null;
        size = 0;
    }
}

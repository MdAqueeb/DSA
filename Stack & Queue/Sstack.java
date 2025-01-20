class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Sstack {
    Node top = null;
    int size = 0;

    public static void main(String[] args) {

        Sstack stk = new Sstack();

        stk.push(new Node(12));
        stk.push(new Node(13));
        stk.push(new Node(9));
        stk.push(new Node(19));
        System.out.println("Top of stack: " + stk.Top());      
        System.out.println("Stack size: " + stk.length());     
        System.out.println("Is stack empty? " + stk.isEmpty()); 
        stk.traverse();
        stk.pop();
        stk.pop();
        System.out.println("the value present in stack? " + stk.search(13));  
        System.out.println("top of stack after pops: " + stk.Top()); 
        Sstack slicedStack = stk.slice(2);
        slicedStack.traverse();
        Sstack anotherStack = new Sstack();
        anotherStack.push(new Node(25));
        Sstack concatenatedStack = stk.concatenate(anotherStack);
        System.out.print("Concatenated Stack: ");
        concatenatedStack.traverse();
        Sstack copiedStack = stk.copy();
        System.out.print("Copied Stack: ");
        copiedStack.traverse();
        stk.sort();
        System.out.print("Sorted Stack: ");
        stk.traverse();
    }

    void push(Node ele) {
        if (top == null) {
            top = ele;
        } else {
            ele.next = top;
            top = ele;
        }
        size += 1;
    }

    void pop() {
        if (size == 0) {
            return;
        }
        top = top.next;
        size -= 1;
    }

    int Top() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    int length() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean search(int value) {
        Node temp = top;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void sort() {
        if (size <= 1) return;

        Sstack tempStack = new Sstack();
        while (!isEmpty()) {
            int current = Top();
            pop();
            while (!tempStack.isEmpty() && tempStack.Top() > current) {
                push(new Node(tempStack.Top()));
                tempStack.pop();
            }
            tempStack.push(new Node(current));
        }

        while (!tempStack.isEmpty()) {
            push(new Node(tempStack.Top()));
            tempStack.pop();
        }
    }

    Sstack slice(int n) {
        Sstack slicedStack = new Sstack();
        Node temp = top;
        int count = 0;

        while (temp != null && count < n) {
            slicedStack.push(new Node(temp.data));
            temp = temp.next;
            count++;
        }
        return slicedStack;
    }

    Sstack concatenate(Sstack other) {
        Sstack concatenatedStack = new Sstack();
        Node temp = top;
        while (temp != null) {
            concatenatedStack.push(new Node(temp.data));
            temp = temp.next;
        }
        temp = other.top;
        while (temp != null) {
            concatenatedStack.push(new Node(temp.data));
            temp = temp.next;
        }
        return concatenatedStack;
    }
    Sstack copy() {
        Sstack copiedStack = new Sstack();
        Node temp = top;
        while (temp != null) {
            copiedStack.push(new Node(temp.data));
            temp = temp.next;
        }
        return copiedStack;
    }

    void traverse() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

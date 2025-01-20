public class Circular_ll {
    static Node head;
    static int size = 0;

    public static void main(String[] args) {
        add(1); 
        add(2);
        add(3);
        traverse_cll(); 
        
        insert_at_beginning(0); 
        traverse_cll();
        
        insert_at_position(2, 5); 
        traverse_cll();
        
        delete_by_index(2); 
        traverse_cll();
        
        delete_by_value(5); 
        traverse_cll();
        
        modify(1, 10); 
        traverse_cll();
        
        System.out.println(find_length()); 
        System.out.println(is_empty()); 
        
        reverse_cll();  
        traverse_cll();
    }

    static void create_cll() {
        head = null;
        size = 0;
    }

    static void add(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node lastNode = head;
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    static void insert_at_beginning(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node lastNode = head.prev;
            newNode.next = head;
            newNode.prev = lastNode;
            lastNode.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    static void insert_at_position(int ind, int ele) {
        if (ind < 0 || ind > size) {
            System.out.println("Invalid index.");
            return;
        }
        if (ind == 0) {
            insert_at_beginning(ele);
            return;
        }
        Node newNode = new Node(ele);
        Node fke = head;
        int cnt = 0;
        while (cnt < ind - 1) {
            fke = fke.next;
            cnt++;
        }
        newNode.next = fke.next;
        newNode.prev = fke;
        if (fke.next != null) {
            fke.next.prev = newNode;
        }
        fke.next = newNode;
        size++;
    }

    static void delete_by_index(int ind) {
        if (ind < 0 || ind >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Node fke = head;
        if (ind == 0) {
            if (head.next == head) {
                head = null; // 
            } else {
                head.prev.next = head.next;
                head.next.prev = head.prev;
                head = head.next;
            }
        } else {
            int cnt = 0;
            while (cnt < ind) {
                fke = fke.next;
                cnt++;
            }
            fke.prev.next = fke.next;
            fke.next.prev = fke.prev;
        }
        size--;
    }

    static void delete_by_value(int value) {
        Node fke = head;
        while (fke != null) {
            if (fke.data == value) {
                if (fke == head) {
                    delete_by_index(0); 
                    return;
                }
                fke.prev.next = fke.next;
                if (fke.next != null) {
                    fke.next.prev = fke.prev;
                }
                size--;
                return;
            }
            fke = fke.next;
            if (fke == head) break; 
        }
        System.out.println("Value not found.");
    }

    static void modify(int ind, int ele) {
        if (ind < 0 || ind >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Node fke = head;
        int cnt = 0;
        while (cnt < ind) {
            fke = fke.next;
            cnt++;
        }
        fke.data = ele;
    }

    static void traverse_cll() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node fke = head;
        do {
            System.out.print(fke.data + " ");
            fke = fke.next;
        } while (fke != head);
        System.out.println();
    }

    static void reverse_cll() {
        if (head == null) {
            return;
        }
        Node fke = head;
        Node temp = null;
        do {
            temp = fke.prev;
            fke.prev = fke.next;
            fke.next = temp;
            fke = fke.prev;
        } while (fke != head);
        head = head.prev;
    }

    static int find_length() {
        return size;
    }

    static boolean is_empty() {
        return head == null;
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

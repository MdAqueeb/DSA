class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Single_ll {
    static Node head = null;
    static int size = 0;

    public static void main(String[] args) {
        add_ele(10);         
        add_ele(20);
        add_ele(30);
        add_ele(40);
        display_ll();        

        insert_at_beginning(5);  
        display_ll();        

        insert_at_end(50);   
        display_ll();        

        insert_at_position(2, 25);  
        display_ll();        

        delete_by_key(20);   
        display_ll();        

        modify_ele(2, 35);   
        display_ll();        

        System.out.println("Search Node : "+search_by_key(35));
        System.out.println("Length : " + find_length());

        reverse_ll();        
        display_ll();        

        System.out.println("Check emptyList : " + is_empty());
    }

    static Node create_ll() {
        return head;
    }

    static void add_ele(int ele) {
        if (head == null) {
            head = new Node(ele);
            size += 1;
            return;
        }
        Node fke = head;
        while (fke.next != null) {
            fke = fke.next;
        }
        fke.next = new Node(ele);
        size += 1;
    }

    static void insert_at_beginning(int ele) {
        Node newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
        size += 1;
    }

    static void insert_at_end(int ele) {
        add_ele(ele);  // Reuse the add_ele method as it already inserts at the end
    }

    static void insert_at_position(int ind, int ele) {
        if (ind < 0 || ind > size) {
            System.out.println("Invalid position");
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
            cnt += 1;
        }
        newNode.next = fke.next;
        fke.next = newNode;
        size += 1;
    }

    static void delete_by_key(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            size -= 1;
            return;
        }

        Node fke = head;
        while (fke.next != null && fke.next.data != key) {
            fke = fke.next;
        }

        if (fke.next != null) {
            fke.next = fke.next.next;
            size -= 1;
        }
    }

    static void modify_ele(int ind, int ele) {
        if (ind >= 0 && ind < size) {
            int cnt = 0;
            Node fke = head;
            while (cnt < ind) {
                fke = fke.next;
                cnt += 1;
            }
            fke.data = ele;
        }
    }

    static boolean search_by_key(int key) {
        Node fke = head;
        while (fke != null) {
            if (fke.data == key) {
                return true;
            }
            fke = fke.next;
        }
        return false;
    }

    static void reverse_ll() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev and current one step forward
            current = next;
        }
        head = prev;  // Update head to the new first node
    }

    static int find_length() {
        return size;
    }

    static boolean is_empty() {
        return head == null;
    }

    static void display_ll() {
        Node fke = head;
        while (fke != null) {
            System.out.print(fke.data + " ");
            fke = fke.next;
        }
        System.out.println();
    }
}

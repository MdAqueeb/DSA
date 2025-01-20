class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Double_ll {
    static Node head = null;
    static int size = 0;

    public static void main(String[] args) {
        add_ele(1);     
        add_ele(2);
        add_ele(3);
        traverse_dll();  

        insert_at_beginning(0); 
        traverse_dll();

        insert_at_end(4);       
        traverse_dll();

        insert_at_position(2, 5);  
        traverse_dll();

        delete_by_index(2);       
        traverse_dll();

        delete_by_value(4);       
        traverse_dll();

        modify_ele(1, 10);        
        traverse_dll();

        System.out.println(search_by_value(10));   
        System.out.println("Length : "+find_length());        

        reverse_dll();            
        traverse_dll();

        System.out.println(is_empty());             
    }

    static Node create_dll() {
        return head;
    }

    static void add_ele(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
        } else {
            Node fke = head;
            while (fke.next != null) {
                fke = fke.next;
            }
            fke.next = newNode;
            newNode.prev = fke;
        }
        size++;
    }

    static void insert_at_beginning(int ele) {
        Node newNode = new Node(ele);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    static void insert_at_end(int ele) {
        add_ele(ele);  
    }

    static void insert_at_position(int ind, int ele) {
        if (ind < 0 || ind > size) {
            System.out.println("Invalid position.");
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
        if (fke.next != null) {
            fke.next.prev = newNode;
        }
        fke.next = newNode;
        newNode.prev = fke;
        size++;
    }

    static void delete_by_index(int ind) {
        if (ind < 0 || ind >= size) {
            System.out.println("Invalid index.");
            return;
        }
        if (ind == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            Node fke = head;
            int cnt = 0;
            while (cnt < ind) {
                fke = fke.next;
                cnt++;
            }
            if (fke.next != null) {
                fke.next.prev = fke.prev;
            }
            if (fke.prev != null) {
                fke.prev.next = fke.next;
            }
        }
        size--;
    }

    static void delete_by_value(int value) {
        Node fke = head;
        while (fke != null) {
            if (fke.data == value) {
                if (fke.prev != null) {
                    fke.prev.next = fke.next;
                }
                if (fke.next != null) {
                    fke.next.prev = fke.prev;
                }
                if (fke == head) {
                    head = fke.next;
                }
                size--;
                return;
            }
            fke = fke.next;
        }
        System.out.println("Value not found.");
    }

    static void modify_ele(int ind, int ele) {
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

    static boolean search_by_value(int value) {
        Node fke = head;
        while (fke != null) {
            if (fke.data == value) {
                return true;
            }
            fke = fke.next;
        }
        return false;
    }

    static void traverse_dll() {
        Node fke = head;
        while (fke != null) {
            System.out.print(fke.data + " ");
            fke = fke.next;
        }
        System.out.println();
    }

    static void reverse_dll() {
        Node fke = head;
        Node temp = null;
        while (fke != null) {
            temp = fke.prev;
            fke.prev = fke.next;
            fke.next = temp;
            fke = fke.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    static int find_length() {
        return size;
    }

    static boolean is_empty() {
        return head == null;
    }
}

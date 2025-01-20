import java.util.LinkedList;

public class CustomLinkedList {

    private LinkedList<Integer> list;

    public CustomLinkedList() {
        this.list = new LinkedList<>();
    }

    public void addFirst(int ele) {
        list.addFirst(ele);
    }

    public void addLast(int ele) {
        list.addLast(ele);
    }

    public void setElement(int index, int ele) {
        list.set(index, ele);
    }

    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            System.out.println("Index out of bounds.");
            return -1; 
        }
    }

    public int size() {
        return list.size();
    }

    public LinkedList<Integer> cloneList() {
        return new LinkedList<>(list); 
    }

    public void clearList() {
        list.clear();
    }

    public void display() {
        System.out.println("Linked List: " + list);
    }

    public static void main(String[] args) {
        CustomLinkedList customList = new CustomLinkedList();

        customList.addFirst(1);
        customList.addFirst(2);
        customList.addFirst(3);
        customList.display();
        customList.setElement(0, 12);
        customList.display();
        customList.remove(1);
        customList.display();
        System.out.println("length of list: " + customList.size());
        LinkedList<Integer> clonedList = customList.cloneList();
        System.out.println("Copy List: " + clonedList);
        customList.clearList();
        System.out.println(customList.size());
    }
}

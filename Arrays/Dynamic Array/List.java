import java.util.ArrayList;
import java.util.Collections;

public class List {
    static ArrayList<Integer> li = new ArrayList<>();
    public static void main(String args[]) {
        append(1);
        append(2);
        insert(3, 1);
        update(4, 0);
        System.out.println(print());
    }

    static void append(int element) {
        li.add(element);
    }

    static void insert(int element, int index) {
        li.add(index, element);
    }

    static void update(int element, int index) {
        li.set(index, element);
    }

    static ArrayList<Integer> print() {
        return li;
    }

    static void remove_value(int element) {
        li.remove(element);
    }

    static void delete(int index) {
        li.remove(index);
    }

    static boolean search(int target) {
        return li.contains(target);
    }

    static void sort(ArrayList<Integer> arr) {
        Collections.sort(arr); 
    }

    static ArrayList<Integer> slicing(int start,int end) {
        return new ArrayList<>(li.subList(start, Math.min(end, li.size()))); 
    }

    static void concat(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        arr1.addAll(arr2);
    }

    static void reverse() {
        Collections.reverse(li); 
    }
}

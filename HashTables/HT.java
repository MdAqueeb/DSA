package DSA.HashTables;

import java.util.Hashtable;

public class HT {

    private Hashtable<Integer, String> hashtable;

    public HT() {
        hashtable = new Hashtable<>();
    }

    public void putValue(int key, String value) {
        hashtable.put(key, value);
    }

    public String getValue(int key) {
        return hashtable.get(key);
    }

    public boolean Key_Search(int key) {
        return hashtable.containsKey(key);
    }

    public boolean Value_Search(String value) {
        return hashtable.containsValue(value);
    }

    public void removeKey(int key) {
        hashtable.remove(key);
    }

    public int getSize() {
        return hashtable.size();
    }

    public void clearTable() {
        hashtable.clear();
    }

    public static void main(String[] args) {
        HT example = new HT();

        example.putValue(1, "One");
        example.putValue(2, "Two");
        example.putValue(3, "Three");
        System.out.println("Value for key 1: " + example.getValue(1)); 
        System.out.println("Contains key 2: " + example.Key_Search(2)); 
        System.out.println("Contains value 'Two': " + example.Value_Search("Two")); 
        example.removeKey(3);
        System.out.println("Contains key 3 after removal: " + example.Key_Search(3)); 
        System.out.println("Size of hashtable: " + example.getSize()); 
        example.clearTable();
        System.out.println("Size of hashtable after clear: " + example.getSize()); 
    }
}

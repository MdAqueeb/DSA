package DSA.HashTables;

import java.util.HashMap;

public class HM {

    private HashMap<Integer, String> hashMap;
    public HM() {
        hashMap = new HashMap<>();
    }

    public void putValue(int key, String value) {
        hashMap.put(key, value);
    }

    public String getValue(int key) {
        return hashMap.get(key);
    }

    public boolean Key_Search(int key) {
        return hashMap.containsKey(key);
    }

    public boolean Value_Search(String value) {
        return hashMap.containsValue(value);
    }

    public void removeKey(int key) {
        hashMap.remove(key);
    }

    public int getSize() {
        return hashMap.size();
    }

    public void clearMap() {
        hashMap.clear();
    }

    public static void main(String[] args) {
        HM example = new HM();

        example.putValue(1, "Apple");
        example.putValue(2, "Banana");
        example.putValue(3, "Orange");
        System.out.println("Value for key 1: " + example.getValue(1)); 
        System.out.println("Contains key 2: " + example.Key_Search(2)); 
        System.out.println("Contains value 'Banana': " + example.Value_Search("Banana")); 
        example.removeKey(3);
        System.out.println("Contains key 3 after removal: " + example.Key_Search(3)); 
        System.out.println("Size of hashmap: " + example.getSize()); 
        example.clearMap();
        System.out.println("Size of hashmap after clear: " + example.getSize()); 
    }
}


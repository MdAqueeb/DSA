package DSA.HashTables;

import java.util.HashSet;

public class HS {

    private HashSet<String> hashSet;

    public HS() {
        hashSet = new HashSet<>();
    }

    public void addElement(String element) {
        hashSet.add(element);
    }

    public boolean SearchElement(String element) {
        return hashSet.contains(element);
    }

    public void removeElement(String element) {
        hashSet.remove(element);
    }

    public int getSize() {
        return hashSet.size();
    }

    public void clearSet() {
        hashSet.clear();
    }

    public static void main(String[] args) {
        HS example = new HS();

        example.addElement("Apple");
        example.addElement("Banana");
        example.addElement("Orange");
        example.addElement("Apple");
        System.out.println("Contains 'Apple': " + example.SearchElement("Apple"));
        example.removeElement("Banana");
        System.out.println("Contains 'Banana' after removal: " + example.SearchElement("Banana")); 
        System.out.println("Size of hashset: " + example.getSize()); 
        example.clearSet();
        System.out.println("Size of hashset after clear: " + example.getSize());
    }
}


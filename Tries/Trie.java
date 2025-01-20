package DSA.Tries;

import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean EndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        EndOfWord = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.EndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }
        return current.EndOfWord; 
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false; 
            }
            current = current.children.get(c);
        }
        return true;
    }

    public boolean delete(String word) {
        return deleteRecursively(root, word, 0);
    }

    private boolean deleteRecursively(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.EndOfWord) {
                return false; 
            }
            current.EndOfWord = false;
            return current.children.isEmpty(); 
        }

        char c = word.charAt(index);
        TrieNode node = current.children.get(c);
        if (node == null) {
            return false; 
        }

        boolean shouldDeleteCurrentNode = deleteRecursively(node, word, index + 1);

        if (shouldDeleteCurrentNode) {
            current.children.remove(c);
            return current.children.isEmpty() && !current.EndOfWord;
        }
        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        trie.insert("ball");
        System.out.println("Search 'apple': " + trie.search("apple")); 
        System.out.println("Search 'app': " + trie.search("app"));     
        System.out.println("Search 'bat': " + trie.search("bat"));     
        System.out.println("Search 'ball': " + trie.search("ball"));   
        System.out.println("Search 'batman': " + trie.search("batman")); 
        System.out.println("Prefix 'app': " + trie.startsWith("app"));  
        System.out.println("Prefix 'ba': " + trie.startsWith("ba"));    
        System.out.println("Prefix 'ballo': " + trie.startsWith("ballo")); 
        System.out.println("Delete 'bat': " + trie.delete("bat"));     
        System.out.println("Search 'bat': " + trie.search("bat"));     
        System.out.println("Prefix 'ba' after deletion: " + trie.startsWith("ba")); 
    }
}

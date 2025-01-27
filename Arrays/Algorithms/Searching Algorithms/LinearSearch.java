// package DSA.Arrays.Algorithms.Searching Algorithms;

public class LinearSearch {
    static int[] Store;
    public static void main(String args[]){
        Store = new int[10];
        System.out.println(linearSearch(5));
    }
    static boolean linearSearch(int target){
        for(int i = 0;i < Store.length;i++){
            if(target == Store[i]){
                return true;
            }
        }
        return false;
    }
}

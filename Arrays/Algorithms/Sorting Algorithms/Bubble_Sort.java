// package DSA.Arrays.Algorithms.Sorting Algorithms;
// The Time Complexity : O(N^2) Space Complexity : O(1) For iterative & O(N) For Recursive
import java.util.Arrays;
public class Bubble_Sort {
    int[] Store;
    public static void main(String args[]){
        Bubble_Sort bubbleSort = new Bubble_Sort();
        bubbleSort.Store = new int[]{5, 2, 9, 1, 5, 6}; 
        int[] result = bubbleSort.BubbleIterative();
        System.out.println(Arrays.toString(result)); 
    }
    int[] BubbleRecursive(int pointer){
        if(pointer < 1){
            return Store;
        }
        boolean chk = false;
        for(int i = 0;i < pointer;i++){
            if(Store[i] > Store[i+1]){
                chk = true;
                int tmp = Store[i];
                Store[i] = Store[i+1];
                Store[i+1] = tmp;
            }
        }
        if(chk == false){
            return Store;
        }
        return BubbleRecursive(pointer-1);
    }
    int[] BubbleIterative(){
        for(int i = 0;i < Store.length;i++){
            boolean chk = false;
            for(int j = 0;j < Store.length-i-1;j++){
                if(Store[j] > Store[j+1]){
                    int tmp = Store[j];
                    Store[j] = Store[j+1];
                    Store[j+1] = tmp;
                    chk = true;
                }
            }
            if(chk == false){
                break;
            }
        }
        return Store;
    }
}

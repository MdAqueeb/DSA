// package DSA.Arrays.Algorithms.Sorting Algorithms;
// The below Code Time : O(n^2) & Space : O(1) For Iterative & O(n) For Recursive

import java.util.Arrays;
public class Selection_Sort {
    int[] Store;
    public static void main(String args[]){
        Selection_Sort selectionSort = new Selection_Sort();
        selectionSort.Store = new int[]{64, 25, 12, 22, 11}; 
        int[] resultIterative = selectionSort.SelectionIterative();
        System.out.println("Sorted Array (Iterative): " + Arrays.toString(resultIterative));

        selectionSort.Store = new int[]{64, 25, 12, 22, 11}; 
        int[] resultRecursive = selectionSort.SelectionRecursive();
        System.out.println("Sorted Array (Recursive): " + Arrays.toString(resultRecursive));
    }
    int FindMin(int pointer,int[] arr){
        if(pointer == arr.length){
            return pointer-1;
        }
        int val = FindMin(pointer+1, arr);
        if(arr[val] < arr[pointer]){
            return val;
        }
        return pointer;
    }
    int[] SelectionRecursive(){
        for(int i = 0;i < Store.length;i++){
            int min = FindMin(i, Store);
            if(min != i){
                int tmp = Store[i];
                Store[i] = min;
                Store[min] = tmp;
            }

        }
        return Store;
    }
    int[] SelectionIterative(){
        for(int i = 0;i < Store.length;i++){
            int min = i;
            for(int j = i;j < Store.length;j++){
                if(Store[j] < Store[min]){
                    min = j;
                }
            }
            if(min != i){
                int tmp = Store[i];
                Store[i] = Store[min];
                Store[min] = tmp;
            }

        }
        return Store;
    }

}

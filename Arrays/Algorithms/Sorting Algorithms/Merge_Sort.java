// package DSA.Arrays.Algorithms.Sorting Algorithms;
import java.util.Arrays;
public class Merge_Sort {
    public static void main(String args[]){
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        Merge_Sort mergeSort = new Merge_Sort();
        int[] sortedArr = mergeSort.MergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    
    }
    int[] MergeSort(int[] arr,int start,int end){
        if(start >= end){
            return arr;
        }
        int mid = start+(end-start)/2;
        int[] left = MergeSort(arr, start, mid-1);
        int[] right = MergeSort(arr, mid, end);
        return Merge(left,right);
    }
    int[] Merge(int[] left,int[] right){
        int[] Store = new int[left.length+right.length];
        int lft = 0,rgt = 0;
        int ind = 0;
        while (lft < left.length && rgt < right.length) {
            if(left[lft] <= right[rgt]){
                Store[ind] = left[lft];
                lft += 1;
            }            
            else if(left[lft] > right[rgt]){
                Store[ind] = right[rgt];
                rgt += 1;
            }
            ind += 1;
        }
        while (lft < left.length) {
            Store[ind] = left[lft];
            lft += 1;
            ind += 1;
        }
        while (rgt < right.length) {
            Store[ind] = right[rgt];
            rgt += 1;
            ind += 1;
        }
        return Store;
    }
}

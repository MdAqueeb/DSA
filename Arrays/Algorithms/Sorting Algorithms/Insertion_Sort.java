// package DSA.Arrays.Algorithms.Sorting Algorithms;

public class Insertion_Sort {
    int[] Store;
    public static void main(String args[]){

    }
    int[] CorrectPosition(int pos,int[] arr){
        if(pos <= 0){
            return arr;
        }
        if(arr[pos-1] > arr[pos]){
            int tmp = arr[pos];
            arr[pos] = arr[pos-1];
            arr[pos-1] = tmp;
        }
        return CorrectPosition(pos-1, arr);
    }
    int[] InsertionRecursive(int[] arr){
        for(int i = 1;i < arr.length;i++){
            arr = CorrectPosition(i,arr);
        }
        return arr;
    }
    int[] InsertionIterative(int[] arr){
        for(int i = 1;i < arr.length;i++){
            for(int j = i;j > 0;j--){
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }   
}

// package DSA.Arrays.Algorithms.Sorting Algorithms;

public class Quick_Sort {
    public static void main(String args[]){
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        Quick_Sort quickSort = new Quick_Sort();
        quickSort.QuickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
    }
    void QuickSort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        // int mid = start+(end-start)/2;
        int partitioning = Partition(arr,start,end);
        QuickSort(arr, start, partitioning-1);
        QuickSort(arr, partitioning+1, end);
    }
    int Partition(int[] arr,int start,int end){
        int high = end-1;
        int low = 0;
        while(low < high){
            if(arr[low] < arr[end]){
                low += 1;
            }   
            else if(arr[high] > arr[end]){
                high -= 1;
            }
            else{
                int tmp = arr[high];
                arr[high] = arr[low];
                arr[low] = tmp;
            }
        }
        int tmp = arr[++low];
        arr[low] = arr[end];
        arr[end] = tmp;
        return low;
    }
}

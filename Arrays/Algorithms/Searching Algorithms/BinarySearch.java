// package DSA.Arrays.Algorithms.Searching Algorithms;

public class BinarySearch {
    int[] Store;
    public static void main(String args[]){
        
    }
    boolean IsSorted(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    int Iterative_BS(int target){
        if(IsSorted(Store) == false){
            return -1;
        }
        int start = 0;
        int last = Store.length-1;
        while (start <= last) {
            int mid = start+(last-start)/2;
            if(Store[mid] == target){
                return mid;
            }
            else if(Store[mid] > target){
                last = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    int recursive_BS(int target,int start_index,int last_index){
        if(start_index == 0 && last_index == Store.length-1){
            boolean chk = IsSorted(Store);
            if(chk == false){
                return -1;
            }
        }
        if(start_index > last_index ){
            return -1;
        }
        int mid = start_index+(last_index-start_index)/2;
        int res;
        if(Store[mid] == target){
            res = mid;
        }
        else if(Store[mid] > target){
            res = recursive_BS(target, start_index, mid-1);
        }
        else{
            res = recursive_BS(target, mid+1, last_index);
        }
        return res;
    }
}

import java.util.Arrays;

class Array {
    static int[] arr;
    static int size = 0;

    public static void main(String args[]) {
        arr = new int[10];

        append(5);
        append(10);
        append(15);
        print();
        delete(10);
        print();
        append(20);
        append(25);
        print();
    }

    static boolean append(int element) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2); 
        }
        arr[size] = element;
        size++;
        return true;
    }

    static boolean append(int element, int index) {
        if (index < 0 || index > arr.length) {
            return false;
        }
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2); 
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1]; 
        }
        arr[index] = element;
        size++;
        return true;
    }

    static boolean update(int new_element,int index){
        if (index < 0 || index > arr.length) {
            return false;
        }
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2); 
        }
        arr[index] = new_element;
        return true;
    }
    
    static int get(int index) {
        if (index < 0 || index >= arr.length) {
            return -1;
        }
        return arr[index];
    }

    static int delete(int element) {
        boolean shift = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                shift = true;
            }
            if (shift && i < size - 1) {
                arr[i] = arr[i + 1];
            }
        }
        if (shift) {
            arr[size - 1] = 0; 
            size--;
            return element;
        }
        return -1;
    }

    static boolean deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            return false; 
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[size - 1] = 0; 
        size--;
        return true;
    }

    static void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean search(int target) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static int[] sort(int[] arrs) {
        Arrays.sort(arrs); 
        return arrs;
    }

    static int[] slicing(int[] arrs, int first, int last) {
        return Arrays.copyOfRange(arrs, first, last);
    }

    static int[] concatenate(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    static int[] reverse(int[] arrs) {
        int[] reversed = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            reversed[i] = arrs[arrs.length - i - 1];
        }
        return reversed;
    }
}

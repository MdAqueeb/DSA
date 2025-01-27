package DSA.Arrays.Array_Basic_Operations;

import java.util.Arrays;

public class Array{
    int[] Store;
    int size;
    public static void main(String[] args){
        Array arr = new Array();
        arr.SetSize(10);
        arr.create();
    }
    private void SetSize(int size){
        if(size <= 0){
            System.out.println("The size will be greater or equals to zero");
            return;
        }
        this.size = size;
        return ;
    }
    private int[] create(){
        if(size <= 0){
            System.out.println("The size will be greater or equals to zero");
            return Store;
        }
        this.Store = new int[size];
        return Store;
    }
    private void resize(){
        int[] fke = new int[Store.length*2];
        System.arraycopy(Store, 0, fke, 0, Store.length);
        Store = fke;
        return;
    }
    int Access(int index){
        if(index > size || index < 0){
            System.out.println("Index Undefined");
            return -1;
        }
        return Store[index];
    }
    String insert_Beggining(int element){
        if(size == Store.length){
            resize();
        }
        for(int i = size; i > 0; i--){
            Store[i] = Store[i - 1];
        }
        Store[0] = element;
        size += 1;
        return "Inserted element";
    }
    void insertByIndex(int index,int element) throws IllegalAccessException{
        if(index < 0 || index >= size){
            throw new IllegalAccessException("Invalid Index");
        }
        if(size == Store.length){
            resize();
        }
        for(int i = size;i > index;i--){
            Store[i] = Store[i-1];
        }
        Store[index] = element;
        size += 1;
        System.out.println("Element Inserted");
        return;
    }
    void DeleteByIndex(int index) throws IllegalAccessException{
        if(index < 0 || index >= size){
            throw new IllegalAccessException("The Index is Undefined");
        }
        for(int i = index;i < size-1;i++){
            Store[i] = Store[i+1];
        }
        size -= 1;
        return ;
    }
    String DeleteByValue(int element){
        boolean chk = search(element);
        if(chk == false){
            return "Not Find";
        }
        boolean shift = false;
        for(int i = 0;i < size-1;i++){
            if(Store[i] == element){
                shift = true;
            }
            if(shift == true){
                Store[i] = Store[i+1];
            }
        }
        size -= 1;
        return "Deleted";
    }
    boolean search(int element){
        for(int i = 0;i < size;i++){
            if(element == Store[i]){
                return true;
            }
        }
        return false;
    }
    void update(int index,int element) throws IllegalAccessException{
        if(index < 0 || index >= size){
            throw new IllegalAccessException("Index not Defined");
        }
        Store[index] = element;
        return;
    }
    void Traverse(){
        for(int i = 0;i < size;i++){
            System.out.print(Store[i]+" ");
        }
        System.out.println();
    }
    int[] slice(int start_index,int last_index) throws IllegalArgumentException{
        if(start_index < 0 || start_index >= size){
            throw new IllegalArgumentException();
        }
        if(last_index < 0 || last_index >= size){
            throw new IllegalArgumentException();
        }
        if(start_index >= last_index){
            throw new IllegalArgumentException();
        }
        int[] sub_arr = Arrays.copyOfRange(Store, start_index,last_index);
        return sub_arr;
    }
    
}
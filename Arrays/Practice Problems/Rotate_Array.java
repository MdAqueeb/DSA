
public class Rotate_Array {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate_Array obj = new Rotate_Array();
        // output : 5,6,7,1,2,3,4
        obj.rotate(nums, k);

    }
    public void rotate(int[] nums,int k){
        for(int i = 0;i < k;i++){
            int store = nums[nums.length-1-i];
            int shift_ele = nums[0];
            for(int j = 1;j < nums.length;j++){
                int tmp = nums[j];
                nums[j] = shift_ele;
                shift_ele = tmp;
            }
            nums[0] = store;
        }
    }
}

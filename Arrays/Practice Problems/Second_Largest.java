
public class Second_Largest {
    public static void main(String args[]){

    }
    public int Find_max(int[] nums){
        int max = nums[0];
        for(int i = 0;i < nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public int Second_max(int[] nums){
        int max = Find_max(nums);
        int max2 = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < max && nums[i] > max2){
                max2 = nums[i];
            }
        }
        return max2;
    }
}

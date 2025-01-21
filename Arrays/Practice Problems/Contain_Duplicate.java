public class Contain_Duplicate{
    public static void main(String args[]){
        Contain_Duplicate obj = new Contain_Duplicate();
        int[] nums = {1,2,3,1};
        obj.duplicate_search(nums);
    }
    public boolean duplicate_search(int[] nums) {
        boolean duplicate = false;
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    duplicate = true;
                    break;
                }
            }
        }
        return duplicate;
    }
}
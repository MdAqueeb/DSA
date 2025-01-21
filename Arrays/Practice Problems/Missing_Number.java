
public class Missing_Number {
    public static void main(String args[]){
        Missing_Number obj = new Missing_Number();
        int[] nums = {3,0,1};
        System.out.println(obj.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        int res = 0;
        int[] nw = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            nw[nums[i]] = 1;
        }
        for(int j = 0;j < nw.length;j++){
            if(nw[j] == 0){
                res = j;
                break;
            }
        }
        return res;
    }
}

public class leetcode152 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        new leetcode152().maxProduct(nums);
    }
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = 1;
        int res =0;
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]*max){
                max = max * nums[i];
                if(res<max){
                    res=max;
                }
            }else {
                max =1;
                continue;
            }
        }
        return res;
    }
}

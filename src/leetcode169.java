import java.util.Arrays;

public class leetcode169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length/2;
        return nums[length];
    }
}

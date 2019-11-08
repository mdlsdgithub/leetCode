import java.util.*;

public class leetcode15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        new leetcode15().threeSum(nums);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1;
                int r = nums.length - 1;
                int sum = 0 - nums[i];
                while(l < r){
                    if (nums[l] + nums[r] == sum) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l < r && nums[l]==nums[l+1]){
                            l++;
                        }
                        while(l<r && nums[r] == nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }else if(nums[l]+nums[r]<sum){
                        while(l<r&&nums[l]==nums[l+1]){
                            l++;
                        }
                        l++;
                    }else if(nums[l]+nums[r]>sum){
                        while(l<r&&nums[r]==nums[r-1]){
                            r--;
                        }
                        r--;
                    }
                }
            }
        }
        return result;
    }
}

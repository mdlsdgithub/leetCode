import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public static void main(String[] args) {
        int[] array = {2,7,11,15 ,9};
        new leetcode1().twoSum(array,9);
    }
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return new int[0];
        }
        int[] result = new int[2];
        Map<Integer,Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(sumMap.containsKey(nums[i])){
                result[0] = sumMap.get(nums[i]);
                result[1] = i;
                break;
            }else{
                sumMap.put(target-nums[i],i);
            }
        }
        return result;
    }
}

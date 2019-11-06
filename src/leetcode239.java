import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode239 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,-1};
        new leetcode239().maxSlidingWindow(nums,1);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<=1){
            return nums;
        }
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(i>=k&&i-k+1>deque.peek()){
                deque.remove();
            }
            while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.add(i);
            if(i-k+1>=0){
                res[i-k+1] = nums[deque.peek()];
            }
        }
        return res;
    }
}

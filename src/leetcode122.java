public class leetcode122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int pre = prices[i];
            int cur = prices[i+1];
            if(cur>pre){
                max+=cur-pre;
            }
        }
        return max;
    }
}

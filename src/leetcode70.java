public class leetcode70 {
    public static void main(String[] args) {
        new leetcode70().climbStairs(2);
    }
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int a = 1;
        int b = 1;
        int res = 0;
        for (int i = 2; i <=n ; i++) {
            res = a+b;
            a = b;
            b = res;
        }
        return res;
    }
}

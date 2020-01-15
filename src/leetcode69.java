public class leetcode69 {
    public static void main(String[] args) {
        new leetcode69().mySqrt(2147395599);
    }
    public int mySqrt(int x) {
        long y = (long)x;
        if(x==1){
            return x;
        }
        return sqrt(x,0,x);

    }
    public int sqrt(long right,long left,long x){
        long res=0;
        long mid=(right-left)/2+left;
        if(mid*mid==x||mid*mid<x&&(mid+1)*(mid+1)>x){
            res=mid;
        }else if(mid*mid<x&&mid*mid>0){
            left=mid;
            res=sqrt(right,left,x);
        }else{

            right=mid;
            res=sqrt(right,left,x);
        }
        return (int)res;
    }
}

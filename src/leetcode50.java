public class leetcode50 {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n<0){
            x=1/x;
            n=-n;
        }
        int nn=n>>1;
        if(n%2==0){

            return myPow(x,nn)*myPow(x,nn);
        }else{
            return myPow(x,nn)*myPow(x,nn)*x;
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String bef="";
        gen(bef,n,n,result);
        return result;
    }
    private List<String> gen(String bef,int left,int right,List<String> result){
        if(right==0){
            result.add(bef);

        }
        if(left>0){
            gen(bef+"(",left-1,right,result);
        }
        if(right>left){
            gen(bef+")",left,right-1,result);
        }
        return result;
    }

}

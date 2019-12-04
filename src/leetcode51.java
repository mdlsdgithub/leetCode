import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode51 {
    Set<Integer> col = new HashSet<>();
    Set<Integer> pie = new HashSet<>();
    Set<Integer> na = new HashSet<>();
    List<List<String>> result = new ArrayList<>();

    public static void main(String[] args) {
        new leetcode51().solveNQueens(4);
    }
    public List<List<String>> solveNQueens(int n) {
        return queen(0,col,pie,na,result,new ArrayList<String>(),n);
    }
    private List<List<String>> queen(int i,Set<Integer> col,Set<Integer> pie,Set<Integer> na,List<List<String>> result,List<String> temp,int n){

        if(temp.size()==n){
            result.add(temp);
        }
        for (int j = 0; j < n; j++) {
            if(j==n-1&&(col.contains(j)||pie.contains(i+j)||na.contains(i-j))){
                return null;
            }
            if(!col.contains(j)&&!pie.contains(i+j)&&!na.contains(i-j)){
                temp.add(addQ(j));
                col.add(j);
                pie.add(i+j);
                na.add(i-j);
                queen(i+1,col,pie,na,result,temp,n);
                col.remove(j);
                pie.remove(i+j);
                na.remove(i-j);
                temp.remove(addQ(j));
            }else{
                continue;
            }
        }
        return  result;

    }
    private String addQ(int j){
        StringBuilder sb = new StringBuilder("....");
        sb.replace(j, j+1, "Q");
        return sb.toString();
    }
}

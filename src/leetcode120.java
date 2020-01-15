import java.util.List;

public class leetcode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        return count(0,0,triangle);

    }
    public int count(int x,int y,List<List<Integer>> triangle){
        if(x==triangle.size()-1){
            return triangle.get(x).get(y);
        }
        int res = 0;
        res = Math.min(count(x+1,y,triangle)+triangle.get(x).get(y),count(x+1,y+1,triangle)+triangle.get(x).get(y));
        return res;
    }
}

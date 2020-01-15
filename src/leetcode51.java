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
        List<List<String>> lists = new leetcode51().solveNQueens(4);
        System.out.println(lists);
    }

    public List<List<String>> solveNQueens(int n) {
        if (n == 0) {
            return result;
        }
        if (n == 1) {
            List<String> t = new ArrayList<>();
            t.add("Q");
            result.add(t);
            return result;
        }
        queen(0, col, pie, na, result, new ArrayList<String>(), n);
        return result;
    }

    private void queen(int i, Set<Integer> col, Set<Integer> pie, Set<Integer> na, List<List<String>> result, List<String> temp, int n) {
        if (temp.size() == n) {
            List<String> newTemp = new ArrayList<>();
            newTemp.addAll(temp);
            result.add(newTemp);
        }
        for (int j = 0; j < n; j++) {
            if (j == n - 1 && (col.contains(j) || pie.contains(i + j) || na.contains(i - j))) {
                return;
            }
            if (!col.contains(j) && !pie.contains(i + j) && !na.contains(i - j)) {
                temp.add(addQ(j, n));
                col.add(j);
                pie.add(i + j);
                na.add(i - j);
                queen(i + 1, col, pie, na, result, temp, n);
                col.remove(j);
                pie.remove(i + j);
                na.remove(i - j);
                temp.remove(addQ(j, n));
            } else {
                continue;
            }
        }

    }

    private String addQ(int j, int n) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(".");
        }
        sb.replace(j, j + 1, "Q");
        return sb.toString();
    }
}

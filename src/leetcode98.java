import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class leetcode98 {
    public static void main(String[] args) {
        new leetcode98().isValidBST(new TreeNode(1));
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> orderNum = new ArrayList<>();
        order(root,orderNum);
        orderNum.clear();
        orderNum.add(1);
        orderNum.add(1);
        boolean flag = true;
        for (int i = 0; i < orderNum.size()-1; i++) {
            if(orderNum.get(i)>orderNum.get(i+1)){
                flag = false;
                break;
            }
        }
        return flag;

    }
    private void order(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        order(root.left,list);
        list.add(root.val);
        order(root.right,list);
    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return null;
        }
        addTree(root,result);
        return result;
    }
    public void addTree(TreeNode node,List<List<Integer>> result){
        Queue<TreeNode> queue = new LinkedList();
        int site = 1;
        queue.add(node);
        while(queue.size()!=0){
            TreeNode node1 = queue.poll();
            queue.add(node1.left);
            queue.add(node1.right);
            if(queue.size()==site){
                List<Integer> nodeList = new ArrayList<>();
                for (int i = 0; i < site; i++) {
                    nodeList.add(queue.poll().val);
                }
                result.add(nodeList);
            }

        }
    }

}

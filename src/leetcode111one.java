import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode111one {
    public int minDepth(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        depth(root,result);
        return result.size();
    }
    private void depth(TreeNode node,List<List<Integer>> result){
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList();
        int site = 1;
        queue.add(node);
        boolean flag = false;
        while (queue.size() != 0) {
            if (queue.size() == site) {
                List<Integer> nodeList = new ArrayList<>();
                int count = site;
                site = 0;
                for (int i = 0; i < count; i++) {
                    TreeNode poll = queue.poll();
                    if (poll != null) {
                        if(poll.right==null&&poll.left==null){
                            flag=true;
                        }
                        if (poll.left != null) {
                            queue.add(poll.left);
                            site++;
                        }
                        if (poll.right != null) {
                            queue.add(poll.right);
                            site++;
                        }
                        nodeList.add(poll.val);
                    }
                }
                result.add(nodeList);
                if(flag){
                    break;
                }
            }
        }
    }
}

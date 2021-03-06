import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode102 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        new leetcode102().levelOrder(node1);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        addTree(root, result);
        return result;
    }

    public void addTree(TreeNode node, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList();
        int site = 1;
        queue.add(node);
        while (queue.size() != 0) {
            if (queue.size() == site) {
                List<Integer> nodeList = new ArrayList<>();
                int count = site;
                site = 0;
                for (int i = 0; i < count; i++) {
                    TreeNode poll = queue.poll();
                    if (poll != null) {
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
            }
        }
    }
}

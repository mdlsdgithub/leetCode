public class leetcode111two {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node1.left = node2;
        new leetcode111two().minDepth(node1);
    }
    public int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        return Math.min(depth(root.left)+1,depth(root.right)+1);
    }
    private int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return 1;
        }
        if(node.left==null){
            return depth(node.right)+1;
        }
        if(node.right==null){
            return depth(node.left)+1;
        }
        return Math.min(depth(node.left)+1,depth(node.right)+1);
    }
}

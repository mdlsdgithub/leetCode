public class leetcode104two {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(depth(root.left)+1,depth(root.right)+1);
    }
    private int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(depth(node.left)+1,depth(node.right)+1);
    }
}

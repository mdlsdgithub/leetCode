class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class leetcode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if((p.val<root.val&&q.val>root.val)||(p.val>root.val&&q.val<root.val)||(q==root)||(p==root)){
            return root;
        }else if(p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{
           return lowestCommonAncestor(root.right,p,q);
        }
    }
}

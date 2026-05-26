public class lowestCommonAncestor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        if(root==null)return null;
        boolean pLiesInLST=exists(root.left,p);
        boolean qLiesInLST=exists(root.left,q);
        if(pLiesInLST==true && qLiesInLST==true)return LowestCommonAncestor(root.left,p,q);
        if(pLiesInLST==false && qLiesInLST==false)return LowestCommonAncestor(root.right,p,q);
        else return root;
    }
    static boolean exists(TreeNode root, TreeNode target) {
        if (root == null)
            return false;
        if (root== target)
            return true;
        return exists(root.left, target) ||
               exists(root.right, target);
    }
    public static void main(String[] args) {
        lowestCommonAncestor LCA=new lowestCommonAncestor();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        TreeNode p=root.left.right.left;
        TreeNode q=root.right.right;
        TreeNode ans=LCA.LowestCommonAncestor(root,p,q);
        System.out.print("Lowest Common Ancestor of Tree is : " +ans.val);
    }
}

public class preandPost {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static int preIdx = 0;
    static int postIdx = 0;
    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, postorder);
    }
    private static TreeNode build(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIdx++]);
        if (root.val != postorder[postIdx]) {
            root.left = build(preorder, postorder);
        }
        if (root.val != postorder[postIdx]) {
            root.right = build(preorder, postorder);
        }
        postIdx++;
        return root;
    }
    public static void main(String[] args) {
        int[] preorder={3 ,9, 20, 15, 7 };
        int[] postorder={9,15,7,20,3};
        TreeNode root=constructFromPrePost(preorder,postorder);
        preorder(root);
    }
    public static void preorder(TreeNode root){
        if(root==null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

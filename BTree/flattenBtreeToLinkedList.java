public class flattenBtreeToLinkedList {
    static int i=0;
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (){}

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(13);
        TreeNode g = new TreeNode(18);
        TreeNode h = new TreeNode(1);
        TreeNode i = new TreeNode(6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        e.left = i;
        flattenLinkedlist(a);
        preorder(a);
    }
    public static void preorder(TreeNode root){
        if(root==null) {
            System.out.print("null"+ " ");
            return;
        }
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void  flattenLinkedlist(TreeNode root){
        if(root==null) return;
        TreeNode nodeleft=root.left;
        TreeNode noderight=root.right;
        flattenLinkedlist(nodeleft);
        flattenLinkedlist(noderight);
        root.left=null;
        root.right=nodeleft;
        TreeNode temp=root;
        while(temp.right!=null) temp=temp.right;
        temp.right=noderight;
       
    }
}

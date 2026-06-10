import java.util.*;
public class inandPostTree {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=0;
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        return BuildTree(postorder,inorder);    
    }
    public  static TreeNode BuildTree(int[] postorder,int[] inorder){
        if (inorder.length == 0)
            return null;
            TreeNode newNode=new TreeNode(postorder[idx]);
            int n=0;
            for(int i=0;i<inorder.length;i++){
                if(inorder[i]==postorder[idx]){
                    n=i;
                    break;
                }
            }
            idx--;
            newNode.right=BuildTree(postorder,Arrays.copyOfRange(inorder, n+1, inorder.length));
            newNode.left=BuildTree(postorder,Arrays.copyOfRange(inorder, 0, n));
            return newNode;
    }
    public static void main(String[] args){
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        TreeNode root=buildTree(inorder, postorder);
        preorder(root);
    }
    public static void preorder(TreeNode root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}


import java.util.*;
public class inandpreTree {
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
    public static TreeNode buildTree(int[] inorder, int[] preorder) {
        return BuildTree(preorder,inorder);    
    }
    public  static TreeNode BuildTree(int[] preorder,int[] inorder){
        if (inorder.length == 0)
            return null;
            TreeNode newNode=new TreeNode(preorder[idx]);
            int n=0;
            for(int i=0;i<inorder.length;i++){
                if(inorder[i]==preorder[idx]){
                    n=i;
                    break;
                }
            }
            idx++;
            newNode.left=BuildTree(preorder,Arrays.copyOfRange(inorder, 0, n));
            newNode.right=BuildTree(preorder,Arrays.copyOfRange(inorder, n+1, inorder.length));
            return newNode;
        }
    public static void main(String[] args){
        int[] inorder={9,3,15,20,7};
        int[] preorder={3 ,9, 20, 15, 7 };
        TreeNode root=buildTree(inorder, preorder);
        preorder(root);
    }
    public static void preorder(TreeNode root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

}
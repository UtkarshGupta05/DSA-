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
        TreeNode root1=buildTree1(preorder, inorder);
        preorder(root);
        System.out.println();
        preorder(root1);
    }
    public static void preorder(TreeNode root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static TreeNode buildTree1(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);

    }
    public static TreeNode helper(int[] preorder,int[] inorder, int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi ||inlo>inhi) return null;
        TreeNode root2=new TreeNode(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize=r-inlo;
        root2.left=helper(preorder,inorder,prelo+1,prelo+leftsize,inlo,r-1);
        root2.right=helper(preorder,inorder,prelo+leftsize+1,prehi,r+1,inhi);
        return root2;
    }

}
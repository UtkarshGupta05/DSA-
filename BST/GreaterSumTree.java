import java.util.*;
public class GreaterSumTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static int i=0;
    public static void convertBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        int sum=0;
        inorder(root,list);
        for(int i=list.size()-1;i>=0;i--){
            sum += list.get(i);
            list.set(i,sum);
        }
        set(root,list);
        inorder(root);
    }
    public static void inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    public static void set(TreeNode root,List<Integer> list){
        if(root==null) return;
        set(root.left,list);
        root.val=list.get(i);
        i++;
        set(root.right,list);

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
        convertBST(a);
    }
}

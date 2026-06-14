import java.util.*;
public class MorrisTraversal {
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
    public static List<Integer>  morrisTraversall(TreeNode root){
        List<Integer> list=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                else{
                    list.add(curr.val);
                    curr=curr.right;
                    pred.right=null;
                }
            }
            else{
                list.add(curr.val);
                curr=curr.right;
            }
        }
        return list;
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
        System.out.print(morrisTraversall(a));
    }

}

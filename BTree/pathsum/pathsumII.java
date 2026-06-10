import java.util.*;
public class pathsumII {

    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static boolean ans;
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h; f.right=i;
        pathSum(a,8);
    }
    public static void pathSum(Node root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int sum=0;
        hasPathSum(root,sum, targetSum,list,ans);
        System.out.println(ans);
    }
    public static void hasPathSum(Node root,int sum, int target,List<Integer> list,List<List<Integer>> ans){
        if(root==null) return;
        sum += root.data;
        list.add(root.data);
        if(root.left==null && root.right==null){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
        }
        else{
            hasPathSum(root.left, sum, target,list,ans);
            hasPathSum(root.right, sum, target,list,ans);
        }
        list.remove(list.size()-1);
       
    }
}

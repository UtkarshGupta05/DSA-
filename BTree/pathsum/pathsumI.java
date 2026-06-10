public class pathsumI {
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
        hasPathSum(a,8);
    }
    public static boolean pathSum(Node root, int targetSum,int sum) {
        if(root==null) return false;
        sum += root.data;
        if(root.left==null && root.right==null){
            return targetSum==sum;
        }
        return pathSum(root.left, sum, targetSum) ||
               pathSum(root.right, sum, targetSum);
    }
    public static void hasPathSum(Node root,int targetSum){
        int sum =0;
        System.out.println("is Path Exist??  " +pathSum(root,targetSum,sum));
    }
}


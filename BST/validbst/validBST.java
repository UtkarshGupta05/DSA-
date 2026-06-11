public class validBST {
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
    public static boolean isValidBST(Node root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.data<=max(root.left) )return false;
        if(root.data>=min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public static long max(Node root){
        if(root==null) return Long.MIN_VALUE;
        long a=root.data,b=max(root.left),c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static long min(Node root){
        if(root==null) return Long.MAX_VALUE;
        long a=root.data,b=min(root.left),c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(3);
        Node e=new Node(7);
        Node f=new Node(13);
        Node g=new Node(18);
        Node h=new Node(1);
        Node i=new Node(6);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        d.left=h; e.left=i;
        System.out.println("BST is valid or not?? : " + isValidBST(a));
    }
}

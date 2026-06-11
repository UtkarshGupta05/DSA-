public class validBST2 {
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
    //Method: 2nd (max(subtree)> root.val  or min(subtree)< root.val  )
    static boolean flag;
    public static boolean isValidBST2(Node root) {
        flag=true;
        max(root);
        min(root);
        return flag;
        
    }
    public static long max(Node root){
        if(root==null) return Long.MIN_VALUE;
        long leftmax=max(root.left);
        if(leftmax>=root.data) flag=false;
        long rightmax=max(root.right);
        return Math.max(root.data,Math.max(leftmax,rightmax));
    }
    public static long min(Node root){
        if(root==null) return Long.MAX_VALUE;
        long leftmin=min(root.left);
        long rightmin=min(root.right);
        if(rightmin<=root.data) flag=false;
        return Math.min(root.data,Math.min(leftmin,rightmin));
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
        System.out.println("BST is valid or not?? : " + isValidBST2(a));
    }
}

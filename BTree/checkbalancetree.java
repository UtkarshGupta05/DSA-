public class checkbalancetree {
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
        isBalanced(a);
    }
    public static void isBalanced(Node root) {
        ans=true;
        height(root);
        System.out.print("Tree is Balanced ?? : " + ans);    
    }

    private static int height(Node root){
        if(root==null) return 0;
        int rh=height(root.right);
        int lf=height(root.left);
        int diff=Math.abs(rh-lf);
        if(diff>1) ans= false;
        return 1+Math.max(lf,rh);
    }
}

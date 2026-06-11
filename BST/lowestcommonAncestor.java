public class lowestcommonAncestor {
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
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root.data>p.data && root.data>q.data) return lowestCommonAncestor(root.left,p,q);
        if(root.data<p.data && root.data<q.data) return lowestCommonAncestor(root.right,p,q);
        else return root;
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
        Node lca=lowestCommonAncestor(a, h, i);
        System.out.print("LCA Between two node p and q : " + lca.data);
}
}
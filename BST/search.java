public class search {
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

    public static Node searchBST(Node root, int val) {
        if(root==null) return root;
        if(root.data>val){
            return searchBST(root.left,val);
        }
        else if(root.data==val){
            Node node=root;
            return node;
        }
        else{
            return searchBST(root.right,val);
        }   
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
        Node node=searchBST(a,5);
        preorder(node);

    }
    public static void preorder(Node root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

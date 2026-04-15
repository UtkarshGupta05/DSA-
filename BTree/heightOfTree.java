public class heightOfTree {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            } 
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
        
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lcount=count(root.left);
        int rcount=count(root.right);
        return lcount+rcount+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int lsum=sum(root.left);
        int rsum=sum(root.right);
        return lsum+rsum+root.data;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.BuildTree(nodes);
        System.out.println("root Node :" +root.data);
        System.out.println("height of the Tree :" +height(root));
        System.out.println("Total No. of nodes :" +count(root));
        System.out.println("sum of all Nodes :" +sum(root));
    }
}


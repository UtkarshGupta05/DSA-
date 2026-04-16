public class Approach1 {
    static int Diameter=0;
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

        Diameter=Math.max(Diameter,lh+rh+1);
        return Math.max(lh,rh)+1;
        
    }
    public static int DiameterOfTree(Node root ){
        if(root==null) return 0;
        height(root);
        return Diameter-1;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.BuildTree(nodes);
        System.out.print("Diameter of Tree is : " +Approach1.DiameterOfTree(root));
    }
}

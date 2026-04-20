public class subTreeOfAnotherTree {
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
    
    public static boolean subTree(Node root,Node subroot){
        if(subroot == null) return true;
        if(root == null) return false;
        if(root.data==subroot.data){ 
            if(isIdentical(root, subroot)){
                return true;
            }         
        }
        return subTree(root.left, subroot) || subTree(root.right, subroot);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
    if(root == null && subRoot == null) return true;
    if(root == null || subRoot == null) return false;
    if(root.data == subRoot.data) {
        return isIdentical(root.left, subRoot.left) &&
               isIdentical(root.right, subRoot.right);
    }
    return false;
}
    public static void main(String[] args) {
        int[] nodes1={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes2={2,4,-1,-1,5,-1,6,-1,-1};
        Node root=BinaryTree.BuildTree(nodes1);
        BinaryTree.idx = -1;
        Node subroot=BinaryTree.BuildTree(nodes2);

        System.out.print("subTree: " +subTreeOfAnotherTree.subTree(root,subroot));
    }
}

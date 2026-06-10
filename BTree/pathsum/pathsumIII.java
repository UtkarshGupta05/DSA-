public class pathsumIII {
    static class Node{
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static boolean ans;
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(-3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(11);
        Node g=new Node(3);
        Node h=new Node(-2);
        Node i=new Node(1);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;d.left=g; 
        d.right=h;e.right=i;
        System.out.println("total valid Path with targetSum value is : " + pathSum(a,8));
    }
    public static int  pathSum(Node root, int sum) {
        if(root==null) return 0;
        return  helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum); 
    }
    public static int helper(Node root,long sum){
        if(root==null) return 0;
        int count=0;
        if(root.val==sum) count++;
        count += helper(root.left,sum-root.val)+helper(root.right,sum-root.val);
        return count;
    }
}

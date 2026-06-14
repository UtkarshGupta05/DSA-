public class preorderToBST {
        static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=helper(preorder, 0,preorder.length-1);
         return root;
    }
    public static TreeNode helper(int[] arr,int start, int end){
        if(start>end) return null;
        TreeNode root=new TreeNode(arr[start]);
        int RnodeIndex=end+1;
        for(int i=start+1;i<=end;i++){
            if(arr[i]>arr[start]){
                RnodeIndex=i;
                break;
            }
        }
        root.left=helper(arr,start+1,RnodeIndex-1);
        root.right=helper(arr,RnodeIndex,end);
        return root;
    }
    public static void main(String[] args) {
        int[] nums={8,5,1,7,10,12};
        TreeNode node =bstFromPreorder(nums);
        inorder(node);
    }
    public static void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);
    }
}

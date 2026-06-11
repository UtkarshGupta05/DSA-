public class sortedArrayintoBST {
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
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private static TreeNode helper(int[] arr,int left, int right){
        TreeNode root=new TreeNode();
        if(left>right) return null;
        int mid=left+ (right-left)/2;
        root=new TreeNode(arr[mid]);
        root.left=helper(arr,left,mid-1);
        root.right=helper(arr,mid+1,right);
        return root;
    }
    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
        TreeNode node =sortedArrayToBST(nums);
        inorder(node);
    }
    public static void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.val +" ");
        inorder(node.right);
    }
}

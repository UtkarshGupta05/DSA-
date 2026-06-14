public class inorderPreSuccessor {
    static TreeNode pred;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(70);
        TreeNode d = new TreeNode(20);
        TreeNode e = new TreeNode(40);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);
        root.left = b;
        root.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        inorderPreAndSuccessor(root, 60);

    }

    public static void inorderPreAndSuccessor(TreeNode root, int node) {
        TreeNode pre = null, suc = null;

        while (root != null) {
            if (root.val == node) {

                // predecessor = rightmost in left subtree
                if (root.left != null) {
                    TreeNode temp = root.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pre = temp;
                }

                // successor = leftmost in right subtree
                if (root.right != null) {
                    TreeNode temp = root.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            }

            else if (node < root.val) {
                suc = root; // possible successor
                root = root.left;
            }

            else {
                pre = root; // possible predecessor
                root = root.right;
            }
        }
            System.out.println("Predecessor: " + (pre == null ? "null" : pre.val));
            System.out.println("Successor: " + (suc == null ? "null" : suc.val));

    }
}

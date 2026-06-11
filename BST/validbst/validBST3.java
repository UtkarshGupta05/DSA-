import java.util.*;

public class validBST3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method: 3nd using inorder traversal

    public static boolean isValidBST(Node root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void inorder(Node root, List<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(3);
        Node e = new Node(7);
        Node f = new Node(13);
        Node g = new Node(18);
        Node h = new Node(1);
        Node i = new Node(6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        e.left = i;
        System.out.println("BST is valid or not?? : " + isValidBST(a));
    }
}

import java.util.*;
public class traversaliterative {
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

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h; f.right=i;
        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Postorder Using 2 stack : ");
        List<Integer> ans1=new ArrayList<>(postorder1(a));
        System.out.print(ans1);
        System.out.println();
        System.out.print("Postorder Using 1 stack : ");
        List<Integer> ans2=new ArrayList<>(postorder2(a));
        System.out.print(ans2);
        System.out.println(); 
        System.out.print("inorder : ");
        System.out.print(inorder(a));
        System.out.println();
    }
    private static void preorder(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            if (node.right != null) st.push(node.right);
            if (node.left != null) st.push(node.left);
            System.out.print(node.data + " ");
        }

    }
    //Using 2 stack approach solution 
    private static List<Integer> postorder1(Node root){
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node node=st1.pop();
            st2.push(node);

            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);

        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
        return ans;
    }
    // Using 1 stack Approach 
    public static List<Integer> postorder2(Node root) {
        List<Integer> ls=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        if(root==null) return ls;
        st.push(root);
        while(!st.isEmpty()){
            Node node=st.pop();
            ls.add(node.data);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        Collections.reverse(ls);
        return ls;
    }
    private static List<Integer> inorder(Node root){
        Stack<Node> st=new Stack<>();
        List<Integer> ls=new ArrayList<>();
        Node temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                Node top=st.pop();
                ls.add(top.data);
                temp=top.right;
                
            }
        }
        return ls;
    }

}

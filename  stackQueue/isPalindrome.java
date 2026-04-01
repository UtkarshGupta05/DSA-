import java.util.Stack;

public class isPalindrome {
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public void addFirst(char data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public boolean isPalindrom(Node head){
        Stack<Character> stack=new Stack<>();
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<size/2;i++){
            if(stack.pop()!=temp.data){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome list=new isPalindrome();
        list.addFirst('a');
        list.addFirst('b');
        list.addFirst('n');
        list.addFirst('b');
        list.addFirst('a');
        System.out.println(list.isPalindrom(head));
    }
}

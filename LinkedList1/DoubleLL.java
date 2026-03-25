package LinkedList1;

public class DoubleLL {
    public  class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    public  static Node head;
    public  static Node tail;
    public static int size;
    //addfirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //removeLast
    public int removeFirst(){
        if(head==null || size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return head.data;
        }
        head=head.next;
        head.prev=null;
        size--;
        return head.data;
    }
    //reverse
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        tail=head;
        head=prev;
    }
    //print
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        } 
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<--->");
            temp=temp.next;
        }
        if(temp==null){
            System.out.print("null");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();
        dll.reverse();
        dll.print();
    }
}

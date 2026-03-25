package LinkedList1;
public class linkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public  Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        } 
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void removeFirst(){
        if(head==null || size==0){
            System.out.println("Linked List is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public void removeLast(){
        if(head==null || size==0){
            System.out.println("Linked List is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
        while(temp.next!=tail){
            //for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int recSearch(int key){
        return recSearchHelper(head, key);
    }
    private int recSearchHelper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=recSearchHelper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        int sz=size;
        if(n==sz){
            head=head.next;
            size--;
            return;
        }
        else if(n>sz){
            System.out.println("Invalid n");
            return;
        }
        Node temp=head;
        for(int i=1;i<sz-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public Node findMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1: find mid
        Node mid=findMid();
        //step2: reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //step3: check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args){
        linkedList ll=new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}

package LinkedList2;

public class removeDuplicateII {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node removeDuplicates() {
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prev=dummy;
        Node curr=head;
        while(curr!=null){ 
            if(curr.next!=null && curr.data==curr.next.data){
                int val=curr.data;
                while(curr!=null && curr.data==val){
                    curr=curr.next;
                }
                prev.next=curr;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
    head=dummy.next;
    return head;
    }


    public static void main(String[] args) {
        removeDuplicateII ll = new removeDuplicateII();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.removeDuplicates();
        ll.print();
    }
}

package LinkedList2;
public class deleteMiddle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode (){}

        ListNode(int val) {
            this.val = val;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(15);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(7);
        ListNode f = new ListNode(13);
        ListNode g = new ListNode(18);
        ListNode h = new ListNode(1);
        ListNode i = new ListNode(6);
        a.next=b; d.next=e;
        b.next=c; e.next=f;
        c.next=d; f.next=g;
        g.next=h; h.next=i;
        ListNode head=deleteMiddlNode(a);
        while(head!=null){
            System.out.print(head.val +" -> ");
            head=head.next;
        }

    }
    public static ListNode deleteMiddlNode(ListNode head){
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int mid =n/2;
        temp=head;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }        
        
        temp.next=temp.next.next;
        return head;
    }
}

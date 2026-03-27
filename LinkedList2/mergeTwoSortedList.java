package LinkedList2;
public class mergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode head;
    public ListNode tail;
    public static int size;

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(ListNode head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (t1 != null && t2 != null) {
            if (t1.val >= t2.val) {
                temp.next= t2;
                temp=t2;
                t2=t2.next;
            } else {
                temp.next =t1;
                temp=t1;
                t1=t1.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }
        else{
            temp.next=t2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        mergeTwoSortedList ll = new mergeTwoSortedList();
            ListNode list1 = new ListNode(1);
            list1.next = new ListNode(2);
            list1.next.next = new ListNode(4);  
            ListNode list2 = new ListNode(1);
            list2.next = new ListNode(3);
            list2.next.next = new ListNode(4);
            ll.print(list1);
            ll.print(list2);
            ListNode mergedHead = ll.mergeTwoLists(list1, list2);
            // Print the merged linked list
            ListNode temp = mergedHead;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;   
            }
    }
}

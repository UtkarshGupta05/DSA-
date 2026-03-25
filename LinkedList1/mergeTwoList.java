package LinkedList1;

public class mergeTwoList {
        public static class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(5);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        mergeTwoList obj = new mergeTwoList();
        ListNode mergedList = obj.mergeTwoLists(list1, list2);
        // Print the merged list        
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

package LinkedList2;

public class reverseKgroups {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        int size = 0;
        ListNode temp = head;
        //count no. of nodes in List
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode curr = head;
        ListNode newHead = null;
        ListNode prevGroupEnd = null;

        while (size>=k) {
            ListNode prev = null;
            ListNode groupStart = curr;
            // reverse group seperately
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            // new head of reversed group only initially
            if (newHead == null) {
                newHead = prev;
            }
            // connecting two reversed group
            if (prevGroupEnd != null) {
                prevGroupEnd.next = prev;
            }
            //updates tail after reverse for next jion
            prevGroupEnd = groupStart;
            size -= k;
        }
        prevGroupEnd.next = curr;

        return newHead;
    }
    public static void main(String[] args) {
        reverseKgroups solution = new reverseKgroups();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 3;
        ListNode reversedHead = solution.reverseKGroup(head, k);
        // Print the reversed list to verify
        ListNode curr = reversedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

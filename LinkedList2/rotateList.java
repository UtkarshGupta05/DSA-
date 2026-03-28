package LinkedList2;

public class rotateList {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        //no. of nodes in List
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        k = k % size;
        if (k == 0) return head;
        // Reach node before new head
        ListNode temp1 = head;
        for (int i = 1; i < size - k; i++) {
            temp1 = temp1.next;
        }
        // New head
        ListNode next1 = temp1.next;
        // Break list
        temp1.next = null;
        // Reach tail of rotated part
        ListNode tail = next1;
        while (tail.next != null) {
            tail = tail.next;
        }
        // Attach old head
        tail.next = head;
        return next1;
    }
    public static void main(String[] args) {
        rotateList solution = new rotateList();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int k = 2;
        ListNode rotatedHead = solution.rotateRight(head, k);
        // Print the rotated list to verify
        ListNode curr = rotatedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

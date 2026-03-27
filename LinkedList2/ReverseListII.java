package LinkedList2;

public class ReverseListII {
        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;
        //Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //Reach node before left
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        //Reverse sublist
        ListNode curr = prev.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ReverseListII solution = new ReverseListII();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        int left = 2;
        int right = 4;

        ListNode result = solution.reverseBetween(head, left, right);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

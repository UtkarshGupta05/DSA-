package LinkedList2;

public class copyLIstFromRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr = head;
        //create new List with same value
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        //copy of random pointer
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
                curr = curr.next.next;
        }
        //seperate the copy list
        curr=head;
        Node newHead=head.next;
        Node newCurr=newHead;
        while(curr!=null){
            curr.next=newCurr.next;
            curr=curr.next;
            if(curr!=null){
                newCurr.next=curr.next;
                newCurr=newCurr.next;
            }
        }
        return newHead;

    }
    public static void main(String[] args) {
        copyLIstFromRandomPointer solution = new copyLIstFromRandomPointer();
        Node head = solution.new Node(1);
        head.next = solution.new Node(2);
        head.next.next = solution.new Node(3);
        head.random = head.next.next; // 1's random points to 3
        head.next.random = head; // 2's random points to 1
        head.next.next.random = head.next; // 3's random points to 2

        Node copiedListHead = solution.copyRandomList(head);
        // Print the copied list to verify
        Node curr = copiedListHead;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.println("Node value: " + curr.val + ", Random points to: " + randomVal);
            curr = curr.next;
        }
    }

}

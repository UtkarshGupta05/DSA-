public class stackUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        Node head;
        public boolean isEmpty() {
            return head == null;
        }
        //push
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        //pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();    
        }
    }
}

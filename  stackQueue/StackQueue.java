import java.util.*;
public class StackQueue {
     static class Stack{
        Deque<Integer> dq1=new LinkedList<>();
        public void push(int data){
            dq1.addLast(data);
        }
        public int pop(){
            return dq1.removeLast();
        }
        public int peek(){
            return dq1.getLast();
        }

    }
    static class Queue{
        Deque<Integer> dq2=new LinkedList<>();
        public void add(int data){
            dq2.addLast(data);
        }
        public int remove(){
            return dq2.removeFirst();
        }
        public int peek(){
            return dq2.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print("top element: " +s.peek() +" ");
        System.out.print(s.pop() +" ");
        System.out.print(s.pop()+" ");
        System.out.println();
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.print("top element:" +q.peek()+" ");
        System.out.print(q.remove()+" ");
        System.out.print(q.remove()+" ");
    }
}

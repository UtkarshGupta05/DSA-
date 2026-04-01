import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class QueueReversal {
    public static Queue<Integer> queuereverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        queuereverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() +"  ");
        }
    }
}

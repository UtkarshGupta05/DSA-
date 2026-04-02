import java.util.*;
public class reverseKElementOfQueue {
    public static void reverseKelement(Queue<Integer> q,int k){
        Queue<Integer> qs=new LinkedList<>();
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<k;i++){
            sc.push(q.remove());
        }
        for(int i=0;i<k;i++){
            qs.add(sc.pop());
        }
        while(!q.isEmpty()){
            qs.add(q.remove());
        }
        while(!qs.isEmpty()){
            System.out.print(qs.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        reverseKelement(q,5);
    }
}

import java.util.*;
public class connectRopeMinCost {
    public static int minCostRopes(int[] arr){
        //using queue and Arrays.sort function 
        Queue<Integer> q=new LinkedList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int result=0;
        q.add(arr[0]+arr[1]);
        for(int i=2;i<n;i++){
            int curr=q.poll();
            q.add(curr+arr[i]);
            result+=curr;
        }
        result+=q.remove();
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.print(minCostRopes(arr));
    }
    public static int minCostRopes1(int[] arr){
        //using priorityQueue 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Step 1: Add all ropes
        for(int x : arr){
            pq.add(x);
        }

        int cost = 0;

        // Step 2: Keep merging
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            cost += sum;

            pq.add(sum);
        }

        return cost;
    }
    
}

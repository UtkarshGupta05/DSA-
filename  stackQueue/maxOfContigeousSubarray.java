import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class maxOfContigeousSubarray {
    public static int[] maxofSubarray(int[] arr,int k){
        Queue<Integer> q=new LinkedList<>();
        int n=arr.length;
        int[] result=new int[n-k+1];
        int max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<k;i++){
            max=Math.max(arr[i],max);
            q.add(arr[i]);
        }
        result[s++]=max;
        for(int i=k;i<n;i++){
            int removed=q.poll();
            q.add(arr[i]);
            if (removed == max) {
                max = Integer.MIN_VALUE;
                for (int x : q) {
                    max = Math.max(max, x);
                }
            } else {
                max = Math.max(max, arr[i]);
            }

            result[s++]=max;
        }
        return result;
    }
    public static int[] maxofSubarrays(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Store result when window is valid
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peekFirst()];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        int k=3;
        System.out.print(Arrays.toString(maxofSubarray(arr, k)));
        System.out.println();
        System.out.print(Arrays.toString(maxofSubarrays(arr, k)));

    }
}

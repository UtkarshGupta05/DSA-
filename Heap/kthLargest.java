package Heap;
import java.util.*;
public class kthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            pq.add(num);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args){
        int[] arr={6,3,5,2,8,10,9};
        System.out.print("Kth Largest element : " + findKthLargest(arr,3));
    }

}

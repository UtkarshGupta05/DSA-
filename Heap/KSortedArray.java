package Heap;
import java.util.*;
public class KSortedArray {
    public static List<Integer> findSortedArray(int[] nums,int k){
        List<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                list.add(pq.poll());
            }
        }
        
        while(pq.size()>0){
            list.add(pq.poll());
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        System.out.print("sorted Array : " +findSortedArray(arr, 3));
    }
}

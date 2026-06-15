package Heap;

import java.util.*;

public  class kClosestToOrigin {
    static public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(){}
        Triplet(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(Triplet t){
            return this.d-t.d;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet>  pq=new PriorityQueue<>(Collections.reverseOrder());
        int[][] ans=new int[k][2];
        for(int i=0;i<points.length;i++){
            int x=points[i][0], y=points[i][1];
            int Sqrt=x*x + y*y;
            pq.add(new Triplet(Sqrt,x,y));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Triplet t=pq.remove();
            ans[i][0]=t.x;
            ans[i][1]=t.y;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,3},{6,-4},{-4,4},{1,1}};
        int[][] ans=kClosest(arr,4);
        for(int i=0;i<ans.length;i++){
            System.out.print("[" + ans[i][0] + "," + ans[i][1] +"]" + ",");
        }
    }
}


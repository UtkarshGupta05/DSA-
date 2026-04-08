import java.util.Arrays;
public class minAbsDiff {
    public static void main(String[] args) {
        int[] A={1,2,3,4};
        int[] B={5,3,6,9};
        //sorting both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff +=Math.abs(A[i]-B[i]);
        }
        System.out.print("minDiff :"+minDiff);

    }
}

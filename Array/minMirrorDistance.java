import java.util.HashMap;
import java.util.Map;

public class minMirrorDistance {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int r = reverse(nums[i]);
            if(map.containsKey(nums[i])){
                min = Math.min(min, i - map.get(nums[i]));
            }
            map.put(r, i);
        }
         return min == Integer.MAX_VALUE ? -1 : min;
    }
    private int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        minMirrorDistance min=new minMirrorDistance();
        int[] arr={21,43,33,54,89,12};
        System.out.print("minimum distance:" +min.minMirrorPairDistance(arr));
    }
}

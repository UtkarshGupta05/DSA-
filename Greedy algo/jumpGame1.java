public class jumpGame1 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxreach=nums[0];
        for(int i=1;i<n;i++){
            if(maxreach<i+nums[i] && maxreach>=i){
                maxreach = i+nums[i];
            }
            if(maxreach<i){
                return false;
            }
        }
        return maxreach>=n-1;
    }
    public static void main(String[] args) {
        jumpGame1 jg=new jumpGame1();
        int[] nums={1,2,4,1,1,0,2,5};
        int[] nums1={1,2,3,1,1,0,2,5};
        System.out.println(jg.canJump(nums));
        System.out.println(jg.canJump(nums1));
    }
}

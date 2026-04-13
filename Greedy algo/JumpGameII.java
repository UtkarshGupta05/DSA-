public class JumpGameII {
    public int jump(int[] nums) {
        int count = 0;
        int currEnd = 0;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == currEnd) {
                count++;
                currEnd = max;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        JumpGameII JG=new JumpGameII();
        int[] game={1,2,4,1,1,0,2,5};
        System.out.print("maximum jump to reach end :" +JG.jump(game));
    }
}

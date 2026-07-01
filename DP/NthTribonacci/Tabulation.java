package DP.NthTribonacci;
public class Tabulation{
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.print("Nth Tribonacci number is : " + tribonacci(6));
    }
}

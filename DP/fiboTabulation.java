package DP;
public class fiboTabulation {
    public static int Fibonacci(int n){
        int[] dp =new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=7;
        System.out.print(  n +"th element of Fibonacci series: " + Fibonacci(n));
    }
}

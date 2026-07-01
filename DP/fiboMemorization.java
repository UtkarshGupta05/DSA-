package DP;
import java.util.*;
public class fiboMemorization {
    public static int Fibonacci(int n){
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        if(n==0|| n==1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[0]=0;
        dp[1]=1;
        return dp[n]=Fibonacci(n-1) +Fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.print(  n +"th element of Fibonacci series: " + Fibonacci(7));
    }
}

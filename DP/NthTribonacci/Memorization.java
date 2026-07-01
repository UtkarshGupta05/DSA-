package DP.NthTribonacci;

import java.util.Arrays;

public class Memorization {
        public static int tribonacci(int n) {
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return solver(dp,n);
        }
        private static int solver(int[] dp,int n){
            if(n==0) return 0;
            if(n==1 || n==2) return 1;
            if(dp[n]!=-1) return dp[n];
            return dp[n]=solver(dp,n-1)+solver(dp,n-2)+solver(dp,n-3);
        }
        public static void main(String[] args) {
            System.out.print("Nth Tribonacci number is : " + tribonacci(6));
        }
}

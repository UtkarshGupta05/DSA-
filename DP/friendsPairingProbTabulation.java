package DP;
import java.util.*;
public class friendsPairingProbTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total number of friends: ");
        int n=sc.nextInt();
        System.out.print("Total pairing possible for friends pairing :"+ pair(n));
        sc.close();
    }
    public static int pair(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        if(n>1)  dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1] +(i-1) * dp[i-2];
        }
        return dp[n];
    }
}


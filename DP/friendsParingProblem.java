package DP;
import java.util.*;
public class friendsParingProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total number of friends: ");
        int n=sc.nextInt();
        System.out.print("Total pairing possible for friends pairing :"+ pair(n));
        sc.close();
    }
    public static int pair(int n){
        if(n<=2) return n;
        return pair(n-1)+ (n-1) *pair(n-2);
    }
}

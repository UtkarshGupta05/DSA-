package DP;

public class fiborecursion {
    public static int Fibonacci(int n){
        if(n==0 ||n == 1) return n;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.print(  n +"th element of Fibonacci series " + Fibonacci(6));
    }
}

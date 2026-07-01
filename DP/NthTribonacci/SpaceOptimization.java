package DP.NthTribonacci;

public class SpaceOptimization {
    public static int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        int d;
        if(n<=1){
            return n;
        }
        for(int i=0;i<n;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Nth Tribonacci number is : " + tribonacci(6));
    }
}

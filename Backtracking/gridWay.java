package Backtracking;
public class gridWay {
    public static void gridWays(int i,int j, int m, int n,String path){
        if(i==m-1 && j==n-1){
            System.out.println(path);
            return;
        }
        if(i==m || j==n){
            return ; 
        }
        if(i<m-1){
            gridWays(i+1, j, m, n, path+"D");
        }
        if(j<n-1){
            gridWays(i, j+1, m, n, path+"R");
        }
    }
    public static void main(String[] args) {
        gridWays(0, 0, 3, 3, "");
    }
}

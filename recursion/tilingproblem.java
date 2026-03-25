package recursion;
public class tilingproblem {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical placement
        int vertical = tiling(n-1);
        //horizontal placement
        int horizontal = tiling(n-2);
        return vertical + horizontal;
    }
  public static void main(String[] args) {
    System.out.println(tiling(6));
  }
}

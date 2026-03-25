package recursion;
public class printBinStrings {
    public static void printBinString(int n, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1, str+"0");
        printBinString(n-1, str+"1");
    }
  public static void main(String[] args) {
    printBinString(3, "");
  }
}

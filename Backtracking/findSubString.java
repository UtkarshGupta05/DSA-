package Backtracking;
public class findSubString {
    public static void findSubStrings(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        // include
        findSubStrings(str, index+1, newString+str.charAt(index));
        // exclude
        findSubStrings(str, index+1, newString);

    }
    public static void main(String[] args) {
        String str="abc";
        findSubStrings(str, 0, "");
    }
}

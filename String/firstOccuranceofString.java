package String;
import java.util.*;
public class firstOccuranceofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        firstOccuranceofString obj = new firstOccuranceofString();
        int result = obj.strStr(haystack, needle);
        System.out.println(result);
        sc.close();
    }

    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        for (int i = 0; i <= n1 - n2; i++) {
            if (haystack.substring(i, i + n2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
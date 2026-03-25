package String;
public class longestHappyPrefix {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = buildLPS(s);
        int len = lps[n - 1];
        return s.substring(0, len);
    }
    private int[] buildLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    return lps;
    }
    public static void main(String[] args) {
        longestHappyPrefix solution = new longestHappyPrefix();
        String s = "level";
        String result = solution.longestPrefix(s);
        System.out.println("Longest happy prefix: " + result);
    }
}

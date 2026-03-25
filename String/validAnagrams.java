package String;
public class validAnagrams {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        validAnagrams solution = new validAnagrams();
        String s = "listen";
        String t = "silent";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Are '" + s + "' and '" + t + "' anagrams? " + result);
    }
}

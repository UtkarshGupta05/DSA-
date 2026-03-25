package String;
public class permutationInString {
    public boolean checkInclusion(String s1, String s2) {        
        if (s1.length() > s2.length()) return false;

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            hash1[s1.charAt(i) - 'a']++;
        }
        int windowSize = s1.length();
        for (int i = 0; i < windowSize; i++) {
            hash2[s2.charAt(i) - 'a']++;
        }
        if (matches(hash1, hash2)) return true;
        
        for (int i = windowSize; i < s2.length(); i++) {
            hash2[s2.charAt(i) - 'a']++;
            hash2[s2.charAt(i - windowSize) - 'a']--;

            if (matches(hash1, hash2)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        permutationInString solution = new permutationInString();
        String s1 = "abc";
        String s2 = "eidcbaooo";
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? " + result);
    }
}

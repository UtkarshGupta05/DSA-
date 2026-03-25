package recursion;
import java.util.ArrayList;
import java.util.List;
public class palindromepartition {
    public List<List<String>> partition(String s) {
        List<List<String>> pld = new ArrayList<>();
        findsubstring(0, s, pld, new ArrayList<String>());
        return pld;
    }

    public void findsubstring(int idx, String s, List<List<String>> ans, ArrayList<String> ds) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < s.length(); ++i) {
            if (isPanlindrome(s, idx, i)) {
                ds.add(s.substring(idx, i + 1));
                findsubstring(i + 1, s, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    boolean isPanlindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        palindromepartition p = new palindromepartition();
        String s = "aabb";
        List<List<String>> ans = p.partition(s);
        System.out.println(ans);
    }
}

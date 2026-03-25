package String;
import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public List<String> generatingParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, String current, 
                           int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return; 
        }
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
    public static void main(String[] args) {
        generateParenthesis solution = new generateParenthesis();
        int n = 3;
        List<String> result = solution.generatingParenthesis(n);
        System.out.println("Generated parentheses combinations: " + result);
    }
}

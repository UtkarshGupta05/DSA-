public class validparenthesis {
    public static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // If stack is empty, there's no matching opening bracket
                }
                char top = stack.pop(); // Pop the top element from the stack
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false; // If the brackets don't match, return false
                }
            }
        }
        return stack.isEmpty(); // If stack is empty at the end, all brackets are matched
    }

    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s)); // Output: true

        s = "({[})";
        System.out.println(isValid(s)); // Output: false
    }
}

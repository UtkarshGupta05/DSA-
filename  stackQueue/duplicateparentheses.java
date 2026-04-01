import java.util.Stack;

public class duplicateparentheses {
    public static boolean isDuplicate(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty() || stack.peek() == '(') {
                    return true; // Found duplicate parentheses
                }
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop(); // Pop characters until an opening parenthesis is found
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Pop the opening parenthesis
                }
            } else {
                stack.push(c); // Push other characters onto the stack
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println(isDuplicate(s)); // Output: true

        s = "(a+(b)/c)";
        System.out.println(isDuplicate(s)); // Output: false
    }

    public static boolean isDuplicate2(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // remove opening '('
                }

            } 
            else {
                // opening / characters
                s.push(ch);
            }
        }
        return false;
    }
}

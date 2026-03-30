package Stack1;

import java.util.Stack;

public class reverseString {
    public static String reverseStrings(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseStrings(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}

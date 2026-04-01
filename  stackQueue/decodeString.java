import java.util.Stack;

public class decodeString {
    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // build number
            }

            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);

                k = 0;
                current = new StringBuilder();
            }

            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(current);
                }

                current = prev;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String s="3[b2[v]]l";
        System.out.println(decodeString.decode(s));

    }
}

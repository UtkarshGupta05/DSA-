import java.util.*;
public class intToBinary2 {
        public static void generateBinary(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            Stack<Integer> stack = new Stack<>();
            // Step 1: Push remainders
            while (num > 0) {
                stack.push(num % 2);
                num = num / 2;
            }
            // Step 2: Pop to get binary
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}


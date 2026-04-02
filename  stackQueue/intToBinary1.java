import java.util.*;
public class intToBinary1 {
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        // Step 1: Start with "1"
        queue.add("1");
        for (int i = 1; i <= n; i++) {
            // Step 2: Get front
            String curr = queue.poll();
            // Step 3: Print binary
            System.out.print(curr + " ");
            // Step 4: Add next binaries
            queue.add(curr + "0");
            queue.add(curr + "1");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}


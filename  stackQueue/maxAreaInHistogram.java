import java.util.Stack;

public class maxAreaInHistogram {
    public static int maxArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static int maxArea2(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        // Calculate left smaller indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                leftSmaller[i] = -1;
            } else {
                leftSmaller[i] = stack.peek();
            }
            stack.push(i);
        }
        //calculate right smaller indices
        Stack<Integer> stack2 = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            while(!stack2.isEmpty() && heights[stack2.peek()] >= heights[i]) {
                stack2.pop();
            }
            if(stack2.isEmpty()) {         
                rightSmaller[i] = n;
            } else {
                rightSmaller[i] = stack2.peek();
            }
            stack2.push(i);
        }
        // Calculate max area        
         for (int i = 0; i < n; i++) {
            int width = rightSmaller[i] - leftSmaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }   

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("max Area using method 2: " + maxArea2(heights)); // Output: 10
        System.out.println("max Area using method 1: " + maxArea(heights)); // Output: 10
    }
}

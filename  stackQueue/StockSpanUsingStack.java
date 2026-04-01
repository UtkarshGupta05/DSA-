public class StockSpanUsingStack {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        span[0] = 1; // The first day always has a span of 1
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(0); // Push the index of the first day

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the current price is greater than or equal to the price at the top of the stack
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            // If the stack is empty, it means all previous prices are less than or equal to the current price
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i); // Push the index of the current day onto the stack
        }
        return span;
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 85,100};
        int[] span = calculateSpan(prices);
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

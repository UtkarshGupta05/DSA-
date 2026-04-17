public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        span[0] = 1; // The first day always has a span of 1

        for (int i = 1; i < n; i++) {
            span[i] = 1; // Initialize span for the current day
            int j = i - 1;

            // Calculate the span by comparing with previous days
            while (j >= 0 && prices[j] <= prices[i]) {
                span[i]++;
                j--;
            }
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

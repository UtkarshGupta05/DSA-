public class nextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack while the current element is greater than or equal to the top of the stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If the stack is empty, there is no greater element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]); // Push the current element onto the stack
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] nextGreaterElements = nextGreater(arr);
        for (int nge : nextGreaterElements) {
            System.out.print(nge + " ");
        }
    }
}

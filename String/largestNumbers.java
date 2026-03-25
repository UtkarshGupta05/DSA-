package String;
import java.util.Arrays;
import java.util.stream.Collectors;

public class largestNumbers {
    public String largestNumber(int[] nums) {
        final String s = Arrays.stream(nums)
                         .mapToObj(String::valueOf)
                         .sorted((a, b) -> (b + a).compareTo(a + b))
                         .collect(Collectors.joining(""));
    return s.startsWith("00") ? "0" : s;
    }
    public static void main(String[] args) {
        largestNumbers solution = new largestNumbers();
        int[] nums = {3, 30, 34, 5, 9};
        String result = solution.largestNumber(nums);
        System.out.println("Largest Number: " + result);
    }
}

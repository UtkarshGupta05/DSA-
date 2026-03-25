package String;
public class isPalindrome {
    public boolean isPalindromes(String s) {
        if (s == null) return false;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome solution = new isPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindromes(s);
        System.out.println(result);

    }
}

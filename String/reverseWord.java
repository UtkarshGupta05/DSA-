package String;
public class reverseWord {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int left= 0;
        int right=arr.length-1;
        while (left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return String.join(" ", arr);
    }
    public static void main(String[] args) {
        reverseWord solution = new reverseWord();
        String s = "  Hello World  ";
        String result = solution.reverseWords(s);
        System.out.println("Reversed Words: '" + result + "'");
    }
}
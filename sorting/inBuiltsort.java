package sorting;
public class inBuiltsort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        java.util.Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void sort(int[] arr) {
        java.util.Arrays.sort(arr);
    }
}

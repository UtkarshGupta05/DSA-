package String;
public class finalValueAfterOperation {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        finalValueAfterOperation obj = new finalValueAfterOperation();
        String[] operations = {"--X","X++","X++"};
        int result = obj.finalValueAfterOperations(operations);
        System.out.println(result); // Output: 1
    }
}

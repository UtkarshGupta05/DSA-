package String;
public class srtingCompression {
    public int compress(char[] chars) {

    int n = chars.length;
    int j = 0;      
    int count = 1; 

    for(int i = 1; i <= n; i++) {

        if(i < n && chars[i] == chars[i - 1]) {
            count++;
        } 
        else {
            chars[j++] = chars[i - 1];

            if(count > 1) {
                String c = String.valueOf(count);
                for(char ch : c.toCharArray()) {
                    chars[j++] = ch;
                }
            }

            count = 1;
        }
    }

    return j;
}
    public static void main(String[] args) {
        srtingCompression solution = new srtingCompression();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = solution.compress(chars);
        System.out.println("Compressed length: " + newLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}

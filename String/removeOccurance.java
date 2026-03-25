package String;
public class removeOccurance {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partLen = part.length();
        
        for (char c : s.toCharArray()) {
            sb.append(c);
            
            if (sb.length() >= partLen && sb.substring(sb.length() - partLen).equals(part)) {
                sb.delete(sb.length() - partLen, sb.length());
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        removeOccurance obj = new removeOccurance();
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = obj.removeOccurrences(s, part);
        System.out.println(result); // Output: "dab"
    }
}

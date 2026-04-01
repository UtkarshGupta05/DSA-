import java.util.Stack;

public class absolutePath {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue; // Skip empty and current directory
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go up one directory
                }
            } else {
                stack.push(component); // Add valid directory to stack
            }
        }

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }

    public static void main(String[] args) {
        absolutePath solution = new absolutePath();
        String path = "/a/./b/../../c/";
        String simplified = solution.simplifyPath(path);
        System.out.println(simplified); // Output: "/c"
    }
    
}

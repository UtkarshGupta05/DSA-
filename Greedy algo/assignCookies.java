import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int content = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0,i=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                content++;
                i++;
            }
            j++;
        }
        
        return content;
    }
    public static void main(String[] args) {
        int[] g = {1,5,3,3,4}, s = {4,2,1,2,1,3};
        assignCookies ac=new assignCookies();
        System.out.print("max number :" + ac.findContentChildren(g,s));
    }
}

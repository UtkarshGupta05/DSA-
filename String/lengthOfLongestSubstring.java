package String;
import java.util.HashMap;
import java.util.Map;
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstrings(String s) {
        Map<Character, Integer> map= new HashMap<>();
        char[] arr=s.toCharArray();
        int left=0;
        int right=0;
        int res=0;
        for(right=0;right<arr.length;right++){
            int idx=map.getOrDefault(arr[right],-1);
            if(idx!=-1 && idx>=left){
                res=Math.max(res,right-1-left+1);
                left=idx+1;
            }
            map.put(arr[right],right);
        }
        return Math.max(res,right-1-left+1);
    }
    public static void main(String[] args) {
        lengthOfLongestSubstring obj=new lengthOfLongestSubstring();
        String s="abcabcbb";
        System.out.println(obj.lengthOfLongestSubstrings(s));
    }
}

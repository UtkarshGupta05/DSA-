package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        findCombinationsum(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    public void findCombinationsum(int idx,int[] arr, int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            ds.add(arr[i]);
            findCombinationsum(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
    }
}
    public static void main(String[] args) {
        combinationsum2 c = new combinationsum2();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = c.combinationSum2(candidates, target);
        System.out.println(ans);
    }
}

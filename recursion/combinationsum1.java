package recursion;
import java.util.ArrayList;
import java.util.List;

public class combinationsum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    public void findCombination(int idx,int[] arr, int target,List<List<Integer>> ans,List<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                ans.add( new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findCombination(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(idx+1,arr,target,ans,ds);
    }

    public static void main(String[] args) {
        combinationsum1 obj = new combinationsum1();
        int[] candidates = {2,3,6,7,1,5,4};
        int target = 7;
        List<List<Integer>> result = obj.combinationSum(candidates, target);
        System.out.println(result);
    }
}

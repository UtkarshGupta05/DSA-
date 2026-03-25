package pairSumInArray;
import java.util.ArrayList;

public class Approach1 {
    public static void main (String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(PairSum(list, 7));
    }
    public static boolean PairSum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
}

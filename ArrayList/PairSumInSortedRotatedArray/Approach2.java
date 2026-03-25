package PairSumInSortedRotatedArray;
import java.util.ArrayList;

public class Approach2 {
    public static void main (String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(PairSum(list, target));
    }
    public static boolean PairSum(ArrayList<Integer> list, int target){
        int n=list.size();
        int i=0;
        int j=n-1;
        while(i!=j){
            if(list.get(i)+list.get(j)==target){
                return true;

            }
            else if(list.get(i)+list.get(j)<target){
                i=(i+1)%n;
            }
            else{
                j=(j-1+n)%n;
            }
        }
        return false;
    }
}

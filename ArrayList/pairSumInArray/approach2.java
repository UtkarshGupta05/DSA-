package pairSumInArray;
import java.util.ArrayList;


public class approach2 {
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
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j)==target){
                return true;
            }
            else if(list.get(i)+list.get(j)<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}

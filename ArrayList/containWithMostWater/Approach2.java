package containWithMostWater;
import java.util.ArrayList;

public class Approach2 {
    public static int maxArea(ArrayList<Integer> height){
        int maxwater=0;
        int i=0;
        int j=height.size()-1;
        while(i<j){
            int width=j-i;
            int h=Math.min(height.get(i), height.get(j));
            int water=width*h;
            maxwater=Math.max(maxwater, water);
            if(height.get(i)<height.get(j)){
                i++;
            }
            else{
                j--;
            }
        } 
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(maxArea(height));
    }
}

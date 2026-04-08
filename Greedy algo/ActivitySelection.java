import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class ActivitySelection {

    public static void main(String[] args) {
        int[] start={10,12,20};
        int[] end ={20,25,30};
        //sorting 
        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function "shortform"
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));
        
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity 
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("max Activities=" + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(activities[i][0])+" ");
        }
        System.out.println();
    }
}

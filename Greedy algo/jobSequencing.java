import java.util.*;
public class jobSequencing {
    public static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] ={{4,20},{1,10},{1,40},{2,30}};
        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        //descending order of profit 
        Collections.sort(jobs,(a,b) ->b.profit-a.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        int maxprofit=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                maxprofit +=curr.profit;
                time++;
            }
        }

        //print sequence 
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
        System.out.print("max profit :" +" " +maxprofit);
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class timeToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.add(new int[]{tickets[i], i});
        }
        int time = 0;
        while (true) {
            int[] curr = q.poll();
            curr[0]--;
            time++;
            if (curr[1] == k && curr[0] == 0) {
                return time;
            }
            if (curr[0] > 0) {
                q.add(curr);
            }
        }
    }
    public static void main(String[] args) {
        int[] tickets={2,3,2};
        int k=2;
        System.out.print(timeRequiredToBuy(tickets,k));
    }

}

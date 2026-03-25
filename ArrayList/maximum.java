import java.util.ArrayList;
public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            //if(list.get(i) > max){
              //  max = list.get(i);
            //}
                max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element: " + max);
    }
}

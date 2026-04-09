import java.util.*;
public class chocolaproblem {
    public static void main(String[] args) {
        Integer[] hor={4,1,2};
        Integer[] ver={2,1,3,1,4};

        // sorting vertical and horizontal cost 
        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());

        int hp=1,vp=1;
        int h=0,v=0;
        int cost=0;
        while(h<hor.length && v<ver.length){
            if(ver[v]<=hor[h]){//horizontal cut
                cost +=(vp*hor[h]);
                hp++;
                h++; 
            }
            else{//vertical cuts
                cost +=(hp*ver[v]);
                vp++;
                v++;
            }
        }
        while(h<hor.length){
            cost +=hor[h]*vp;
            hp++;
            h++;
        }
        while(v<ver.length){
            cost +=ver[v]*hp;
            vp++;
            v++;
        }
        System.out.println("min cost of cuts : " + cost);
    }
}

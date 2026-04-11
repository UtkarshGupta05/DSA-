public class canPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s=flowerbed.length;
        int count=0;
        if(s==1 && flowerbed[0]==0) return true;
        // check start 
        if (s >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0]=1;
            count++;
        }
        // check end
        if (s >= 2 && flowerbed[s - 1] == 0 && flowerbed[s - 2] == 0) {
            flowerbed[s-1]=1;
            count++;
        }
        // check for middle
        for (int i = 1; i < s - 1; i++) {
            if (flowerbed[i]==(flowerbed[i - 1]) && flowerbed[i]==(flowerbed[i + 1])) {
                flowerbed[i]=1;
                count++; 
            }
        }
        if(count>=n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        canPlaceFlower cpf=new canPlaceFlower();
        int[] flowerbed={0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0};
        System.out.println(cpf.canPlaceFlowers(flowerbed, 4));
    }
}

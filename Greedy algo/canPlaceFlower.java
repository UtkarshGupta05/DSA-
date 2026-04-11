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
        return count>=n;
    }

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
    int count = 0;

    for (int i = 0; i < flowerbed.length; i++) {

        // check if current spot is empty
        if (flowerbed[i] == 0) {

            // check left and right
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            // if both sides are empty → plant flower
            if (left == 0 && right == 0) {
                flowerbed[i] = 1;
                count++;

                // optimization: skip next index
                i++;
            }
        }
    }

    return count >= n;

}
    public static void main(String[] args) {
        canPlaceFlower cpf=new canPlaceFlower();
        int[] flowerbed={0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0};
        int[] flowerbed1={0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0};
        System.out.println(cpf.canPlaceFlowers(flowerbed, 4));
        System.out.println(cpf.canPlaceFlowers1(flowerbed1, 4));
    }
}

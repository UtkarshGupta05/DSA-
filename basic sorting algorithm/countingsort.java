public class countingsort {
    static void countingSort(int arr[]){
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i=0; i<=max; i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
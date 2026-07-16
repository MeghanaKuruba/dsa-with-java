package Arrays.logic;

public class RemoveElement {
    public static int remove(int[] arr, int val){
        int k = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}

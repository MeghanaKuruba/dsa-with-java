package Arrays.logic;

public class MoveZerosToEnd {
    public static void swap (int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void move(int[] arr){
        int n = arr.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                swap(arr, i, j);
                j++;
            }
        }
        Traversal.traversal(arr);
    }
}

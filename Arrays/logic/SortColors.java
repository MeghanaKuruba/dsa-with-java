package Arrays.logic;

public class SortColors {
    // Dutch National Flag Algorithm
    public static void swap(int[] arr, int start, int end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }
    public static void sortcolors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, high);
                high --;
            }
        }
        Traversal.traversal(arr);
    }
}

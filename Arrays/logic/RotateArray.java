package Arrays.logic;

public class RotateArray {

    public static void swap(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void rotate(int[] arr, int k){
        // using extra space

        int n = arr.length;
        k = k % n;

//        int j = 0;
//        int a[] = new int[n];
//        for(int i = n-k; i < n; i++){
//            a[j] = arr[i];
//            j++;
//        }
//
//        for(int i = 0; i < n-k; i++){
//            a[j] = arr[i];
//            j++;
//        }
//        Traversal.traversal(a);

        if (arr == null || arr.length == 0) {
            return;
        }

        swap(arr, n-k, n-1);
        swap(arr, 0, n-k-1);
        swap(arr, 0, n-1);

        Traversal.traversal(arr);
    }
}

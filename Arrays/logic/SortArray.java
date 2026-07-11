package Arrays.logic;

public class SortArray {
    public static void sort(int[] arr){
        int n = arr.length;

        // move even in the beginning and odd nums at last(order doesn't matter)

//        int left = 0;
//        int right = 0;
//
//        while(left<right){
//            if (arr[left] % 2 == 1 && arr[right] % 2 == 0){
//                RotateArray.swap(arr, left, right);
//                left++;
//                right--;
//            }
//            if (arr[left] % 2 == 0){
//                left++;
//            }
//            if (arr[right] % 2 == 1){
//                right--;
//            }
//        }


        for (int i= 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] > arr[j]){
                    RotateArray.swap(arr, i, j);
                }
            }
        }
        Traversal.traversal(arr);
    }
}

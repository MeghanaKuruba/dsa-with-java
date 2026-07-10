package Arrays.logic;

public class SortZeorsAndOnes {
    public static void sort(int[] arr){
        // using extra space

        int n = arr.length;
//        int[] a = new int[n];
//        int cnt = 0;
//
//        for(int i = 0; i<n; i++){
//            if (arr[i] == 0){
//                cnt++;
//            }
//        }
//        for(int i = 0; i < n; i++){
//            if (i < cnt){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//        }

        // without using extra space

        int left = 0;
        int right = n-1;

        while (left<right){

            if (arr[left] == 1 && arr[right] == 0){
                RotateArray.swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
        Traversal.traversal(arr);
    }
}

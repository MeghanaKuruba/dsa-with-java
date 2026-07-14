package Arrays.logic;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;
                right++;
            }else {
                break;
            }
        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        SortArray.sort(arr1);
        SortArray.sort(arr2);

        Traversal.traversal(arr1);
        System.out.println(" ");
        Traversal.traversal(arr2);
    }
}

package Arrays;

import Arrays.logic.*;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //Taking Input
//        System.out.println("Enter elements");
//        for (int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        //Print array
//        for (int i = 0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

//        int[] arr = {8,1,5,8,6,7};


//        MinMax.minMax(arr);
//        Reverse.reverse(arr);
//        PrefixSum.prefixSum(arr);
//        int sum = TargetSum.targetSum(arr, 10);

//        int ans = UniqueElement.unique(arr);
//        System.out.println(ans);
//        System.out.println(SecondLargest.secondLargest(arr));
//        Swap.swap(2,3);
//        RotateArray.rotate(arr, 2);
//        FrequencyArray.frequency(arr);
//        int[] arr = {0,1,0,1,1,1,0,0};
//        SortZeorsAndOnes.sort(arr);
//        SortArray.sort(arr);

//        int[] arr = {1, 5, 6, 7, 8, 8};
//        int[] arr2 = {0,1,4,9};
//        MergeSortedArray.merge(arr, arr2, arr.length, arr2.length);

        int[] arr = {2,0,2,1,1,1,0,1,2,0};
        SortColors.sortcolors(arr);
    }
}
